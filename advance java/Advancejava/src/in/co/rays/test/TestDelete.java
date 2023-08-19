package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestDelete {
	
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection comm = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		
		Statement stmt = comm.createStatement();
		
		//stmt.executeUpdate("delete from markseet where id=6");
		stmt.executeUpdate("delete from markseet where id=1");
		
		System.err.println("data delete="+1);
		
	}

}
