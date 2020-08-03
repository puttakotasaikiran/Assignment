package Assignment9;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

 
public class ProductsDemo1 {
	 public static void main(String a[]) 
	    { 
	        //Creating the connection 
	        String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
	        String user = "DXC"; 
	        String pass = "Saikiran@1"; 
	        Connection con=null; 
	        String command="select * from PRODUCTS";
	        try
	        { 
	            DriverManager.registerDriver(new oracle.jdbc.OracleDriver()); 
	  
	           
	            con = DriverManager.getConnection(url,user,pass); 
	  
	            Statement st = con.createStatement(); 
	            ResultSet result=st.executeQuery(command);
	            
	          while(result.next()) {
	        	  System.out.println(result.getString("PROD_CODE") +":"+result.getString("PROD_NAME")+":"+result.getString("PROD_PRICE")+":"+result.getString("PROD_CATG"));
	          }
	        	  
	           
	        } 
	        catch(Exception ex) 
	        { 
	            System.err.println(ex); 
	        } 
	        finally {
	        	 
	        	try{
	        		con.close(); 
	        	}
	        	catch(SQLException e) {
	        		System.out.println(e);
	        	}
			}
	    } 
	} 
