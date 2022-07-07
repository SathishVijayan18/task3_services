package com.task3_services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class JdbcConnect {
	 private static final Logger log = LogManager.getLogger(JdbcConnect.class);
	public static Connection con=null;
	public static String dbUrl="jdbc:mysql://localhost:3306/employees";
	public static String userId="root";
	public static String pwd="mypass";
	
	public static Connection connectDB() throws SQLException{
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		con=DriverManager.getConnection(dbUrl,userId,pwd);
		if(con!=null) {
			log.info("Database connection established...");
		}else {
			log.info("connection failed.....");
		}
		return con;
	}
}
