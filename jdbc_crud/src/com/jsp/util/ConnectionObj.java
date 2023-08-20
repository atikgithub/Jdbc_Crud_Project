package com.jsp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionObj {
  
public static Connection getConnection() {
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/jdbc_crud","root","root");
		return connection;
	}	
  catch (ClassNotFoundException | SQLException  e) {
		
		e.printStackTrace();
	} 
	 return null;
   }
   
}
