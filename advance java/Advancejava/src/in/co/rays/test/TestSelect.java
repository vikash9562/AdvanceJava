package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestSelect {
	
	public static void main(String[] args) throws  Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection comm =  DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root", "root");
		
		Statement stml = comm.createStatement();
		
		ResultSet Rs = stml.executeQuery("select * from markseet");
		
		while (Rs.next()) {
			System.out.println(Rs.getInt(1));
			System.out.println(Rs.getString(2));
			System.out.println(Rs.getInt(3));
			System.out.println(Rs.getInt(4));
			System.out.println(Rs.getInt(5));
			System.out.println(Rs.getInt(6));
			
		}
		
	}

}
