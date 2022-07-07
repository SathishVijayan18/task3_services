package com.task3_services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateLogic {
public static void insertData(int empId,String empName,int empSal,int deptCode) throws SQLException {
	PreparedStatement ps;
	Connection con=JdbcConnect.connectDB();
	ps=con.prepareStatement("INSERT INTO employees VALUES ('"+empId+"','"+empName+"','"+empSal+"','"+deptCode+"')");
	ps.executeUpdate();
	con.close();
}
}
