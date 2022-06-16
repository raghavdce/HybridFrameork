package com.mindtree.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadOTP {

	public static String getOTP() throws SQLException {

		String url = "jdbc:postgresql://52.172.54.231:9001/mosip_kernel";

		// "jdbc:postgresql://+hostname+":"+port+"//dbName"

		Connection con = DriverManager.getConnection(url, "postgres", "QAdbadmin@123");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from kernel.otp_transaction where id='raghavdce@gmail.com'");
		String otp = "";
		while (rs.next()) {
			otp = rs.getString("otp").toString();
		}
		return otp;
		 //System.out.println(otp);

	}

	
	/* public static void main(String[] args) {
	  
	  try { ReadOTP.getOTP(); } 
	  
	  catch (SQLException e) 
	  { 
	  e.printStackTrace(); }
	  
	  }*/
	 
}
