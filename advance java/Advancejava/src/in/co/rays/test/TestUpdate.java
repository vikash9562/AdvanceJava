package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestUpdate {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection comm = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		
		Statement stmt = comm.createStatement();
		
		stmt.executeUpdate("update markseet set address='bhopal' where id=7");
		System.out.println("data update="+1);
		
		
	}

}
