package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class testPreparedAdd {
	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		
		PreparedStatement ps =  conn.prepareStatement("insert into markseet values(6,'vikash',108,87,85,76)");
		
		int i = ps.executeUpdate();
		System.out.println(i);
		
	}
	
	

}
