package in.co.rays.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import in.co.rays.util.JDBCDataSource;

public class testJDBC {
	
	public static void main(String[] args) throws Exception {
		
		for (int i = 0; i <= 30; i++) {
			System.out.println(i);
		
		testGet();
		}
		
	}

	private static void testGet() throws Exception {
		
		Connection conn = JDBCDataSource.getConnection();
		
		PreparedStatement ps = conn.prepareStatement("select * from markseet where id=1");
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			
			System.out.print("\t"+rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print("\t"+rs.getInt(3));
			System.out.print("\t"+rs.getInt(4));
			System.out.print("\t"+rs.getInt(5));
			System.out.println("\t"+rs.getInt(6));
			
		}
		
		
	}

}



