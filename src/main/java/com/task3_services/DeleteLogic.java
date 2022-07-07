package com.task3_services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class DeleteLogic {
	 private static final Logger log = LogManager.getLogger(DeleteLogic.class);  
	 public static void RemoveService(int empId) throws SQLException {
		 Connection con=JdbcConnect.connectDB();
		 String sql="delete from employees where empId=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, empId);
			int rs=ps.executeUpdate();
			con.close();
	 }
}
