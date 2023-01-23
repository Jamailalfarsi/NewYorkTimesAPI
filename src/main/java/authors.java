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

public class authors {

	public static void getDataAuthors() throws IOException, InterruptedException {
		 String jsonUrl = "https://api.nytimes.com/svc/books/v3/lists/current/hardcover-fiction.json?api-key=UBt6ezvwrwG4h1E0UUlLv9BkrBJ4PImA";
		 		
		        HttpClient client = HttpClient.newHttpClient();
		        HttpRequest request = HttpRequest.newBuilder()
		                .uri(URI.create(jsonUrl))
		                .build();
		        HttpResponse<String> response = client.send(request,
		                HttpResponse.BodyHandlers.ofString());
		      
		        
		       
		     // Creating the connection using Oracle DB
		        // Note: url syntax is standard, so do grasp
		        String url = "jdbc:mysql://localhost:3306/NewYorkAPI";

		        // Username and password to access DB
		        // Custom initialization
		        String user = "root";
		        String pass = "root";
		        
		        Gson gsonObject1=new Gson();
		    
		        AuthorsMain fetchGson=gsonObject1.fromJson(response.body(),AuthorsMain.class);
		        
	         
		         for(int i=0;i<response.body().length();i++) {
		    	 System.out.println("The Display_name is:"+fetchGson.getResults().getDisplay_name());
		    	 System.out.println("The Next_published_date is:"+fetchGson.getResults().getNext_published_date());
		    	 System.out.println("The Previous_published_date is:"+fetchGson.getResults().getPrevious_published_date());
		    	 System.out.println("The Published_date_description is:"+fetchGson.getResults().getPublished_date_description());
		    	 System.out.println("The Author Name is:"+fetchGson.getResults().getBooks()[i].getAuthor());
		    	 System.out.println("The Publisher is:"+fetchGson.getResults().getBooks()[i].getPublisher());
		    	 System.out.println("The Title is:"+fetchGson.getResults().getBooks()[i].getTitle());
		    	 
		    	 
		    	 
	           
		        
		    	
	    	   // Inserting data using SQL query
		    	 String sql = "insert into authors (Display_name,Next_published_date,Previous_published_date,Published_date_description,Author,Publisher,Title)"
		    	 		+ "values('"+fetchGson.getResults().getDisplay_name()+"','"+fetchGson.getResults().getNext_published_date()+"','"+fetchGson.getResults().getPrevious_published_date()+"','"+fetchGson.getResults().getPublished_date_description()+"','"
		    			 +fetchGson.getResults().getBooks()[i].getAuthor()+"','"+fetchGson.getResults().getBooks()[i].getPublisher()+"','"+fetchGson.getResults().getBooks()[i].getTitle()+"')"; 
		         
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
