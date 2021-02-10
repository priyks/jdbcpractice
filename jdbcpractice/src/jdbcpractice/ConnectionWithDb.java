package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionWithDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  final String driver_Name="com.mysql.cj.jdbc.Driver";
	  final String url="jdbc:mysql://localhost:9090/java";
	  String userName="root";
	  String password="12@SyZip";
	  Connection con=null;
	  
	  try {
		  
		  Class.forName(driver_Name);  
		  
		  con=DriverManager.getConnection(url,userName,password);
		  
		  System.out.println(con.isClosed()?"Connection is close":"Database is Connected...!");
		  
		  /*if(con.isClosed()) {
			  System.out.println("Connection is close");
		  }
		  else {
			  System.out.println("Database is Connected...!");
		  }*/
		  
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  

	}

}
