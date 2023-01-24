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

public class ALTERTable {

	public static void ALTERTableFunction() throws IOException, InterruptedException {
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
		        
		        //Gson gsonObject1=new Gson();
		    
		       // ArtSection fetchGson=gsonObject1.fromJson(response.body(),ArtSection.class);
		        
		
	    	   // Inserting data using SQL query
		    	 String sql = "ALTER TABLE artical ADD Column section_id int";
		    	 
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
	public static void ALTERTableFunction2() throws IOException, InterruptedException {
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
		        
		        //Gson gsonObject1=new Gson();
		    
		       // ArtSection fetchGson=gsonObject1.fromJson(response.body(),ArtSection.class);
		        
		
	    	   // Inserting data using SQL query
		    	 String sql = "ALTER TABLE artical ADD Column author_id int";
		    	 
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


