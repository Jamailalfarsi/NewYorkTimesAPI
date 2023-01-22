
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

import com.google.gson.Gson;



public class Artical {

	public static void getData() throws IOException, InterruptedException {
		 String jsonUrl = "https://api.nytimes.com/svc/search/v2/articlesearch.json?q=election&api-key=UBt6ezvwrwG4h1E0UUlLv9BkrBJ4PImA";
		 		
		        HttpClient client = HttpClient.newHttpClient();
		        HttpRequest request = HttpRequest.newBuilder()
		                .uri(URI.create(jsonUrl))
		                .build();
		        HttpResponse<String> response = client.send(request,
		                HttpResponse.BodyHandlers.ofString());
		      // System.out.println("The JSON of the API is :" +Atributies.body());
		        
		       
		     // Creating the connection using Oracle DB
		        // Note: url syntax is standard, so do grasp
		        String url = "jdbc:mysql://localhost:3306/NewYorkAPI";

		        // Username and password to access DB
		        // Custom initialization
		        String user = "root";
		        String pass = "root";
		        
		        Gson gsonObject1=new Gson();
		    
		        ArtSection fetchGson=gsonObject1.fromJson(response.body(),ArtSection.class);
		        
		         
		         for(int i=0;i<response.body().length();i++) {
		    	
		        System.out.println("The Pub_date is:"+fetchGson.getResponse().getDocs()[i].getPub_date());
		        System.out.println("The Document_type is:"+fetchGson.getResponse().getDocs()[i].getDocument_type());
		        System.out.println("The Section_name is:"+fetchGson.getResponse().getDocs()[i].getSection_name());
		        System.out.println("The Uri is:"+fetchGson.getResponse().getDocs()[i].getUri());
		    	
	    	   // Inserting data using SQL query
		    	 String sql = "insert into artical (Pub_date,Document_type,Section_name,Uri)values('"+fetchGson.getResponse().getDocs()[i].getPub_date()+"','"+fetchGson.getResponse().getDocs()[i].getDocument_type()+"','"+fetchGson.getResponse().getDocs()[i].getSection_name()+"','"+fetchGson.getResponse().getDocs()[i].getUri()+"')"; 
		         
		    	   System.out.println("__________________________________");
			       System.out.println(sql);
			       System.out.println("__________________________________");
			       // Connection class object
			        Connection con = null;

			        // Try block to check for exceptions
			        try {

			            Driver driver = (Driver) Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			            // Registering drivers
			            DriverManager.registerDriver(driver);

		            // Reference to connection interface
		            con = DriverManager.getConnection(url, user,
	                    pass);

			            // Creating a statement
			            Statement st = con.createStatement();

			            // Executing query
			            int m = st.executeUpdate(sql);
			           if (m >=  1)
		               System.out.println(
		                        "inserted successfully : " + sql);
		           else
			                System.out.println("insertion failed");

			            // Closing the connections
			            con.close();
			        }

		        // Catch block to handle exceptions
	        catch (Exception ex) {
		            System.err.println(ex);
	        }
		       
		       
	
	             
		   
	} 
	}
		        
}



