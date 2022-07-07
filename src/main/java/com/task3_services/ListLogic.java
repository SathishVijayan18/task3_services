package com.task3_services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.simple.JSONObject;
public class ListLogic {
public static JSONObject fetchData(int empId) throws SQLException {
	Connection con=JdbcConnect.connectDB();
	String sql="select * from employees where empId=?";
	PreparedStatement ps=con.prepareStatement(sql);  
	ps.setInt(1, empId);
	ResultSet rs=ps.executeQuery();  
	int emp_id=0,empSal = 0,deptCode = 0;
	String empName="";
	while(rs.next()){  
		//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));  
		emp_id=rs.getInt(1);
		empName=rs.getString(2);
		empSal=rs.getInt(3);
		deptCode=rs.getInt(4);
		}
	JSONObject jobj=new JSONObject();
	jobj.put("ID", emp_id);
	jobj.put("NAME", empName);
	jobj.put("SALARY",empSal);
	jobj.put("DEPT_CODE",deptCode);
	System.out.println(jobj);
	return jobj;  
}
}
