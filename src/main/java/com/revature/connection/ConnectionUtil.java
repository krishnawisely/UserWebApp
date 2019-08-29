package com.revature.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	public static Connection getConnection() throws SQLException,ClassNotFoundException
	{
	
		String driverClass = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://trainingdb.ck1ayq0lncmp.ap-south-1.rds.amazonaws.com:3306/bankapp";
		
		String user = "root";
		String password = "root";
		
		Class.forName(driverClass);
		
		Connection conn = DriverManager.getConnection(url,user,password);
		
		return conn;
	}

}