package com.autobot.generics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectionLib 
{
//	@SuppressWarnings("deprecation")
	public void updateQuery(String query)
	{
		Connection conn = null;
		  try
		  {
		   String dbName="testsite1";
		   String userName = "root";
		   String password = "";
		   String url = "jdbc:mysql://localhost:3306/";
		   Class.forName ("com.mysql.cj.jdbc.Driver").newInstance();
		   conn = DriverManager.getConnection(url+dbName, userName, password);
		   //"?useJDBCCompliantTimezoneShift=true;useLegacyDatetimeCode=false;serverTimezone=GMT+5:30;"

		   System.out.println("Connected to the Database");
		   
	       Statement stmt = conn.createStatement();
		   int r=stmt.executeUpdate(query);
		   System.out.println(r);
		   
		   System.out.println("Disconnect from database");
		   
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		  
	}
	
	
	public void executeQuery(String query)
	{
		Connection conn = null;
		  try
		  {
		   String dbName="testsite1";
		   String userName = "root";
		   String password = "";
		   String url = "jdbc:mysql://localhost:3306/";
		   String f1;
		   Class.forName ("com.mysql.cj.jdbc.Driver").newInstance();
		   conn = DriverManager.getConnection(url+dbName, userName, password);
	       System.out.println("Connected to the Database");
		   
	       Statement stmt = conn.createStatement();
		   ResultSet rs = stmt.executeQuery(query);

		   while(rs.next())
		   {
			   f1=rs.getString(1);
			   System.out.println(f1);
		   }
		   System.out.println("Disconnect from database");
		   
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
		  
	}

}
