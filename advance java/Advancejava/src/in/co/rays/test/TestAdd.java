package in.co.rays.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestAdd {
	public static void main(String[] args) throws Exception {
		
		Connection comm = null;
		
	try {	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
	 comm	= DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
	   comm.setAutoCommit(false);
	Statement stmt = comm.createStatement();
	
	stmt.executeUpdate("insert into markseet values(1,'raj',101,44,55,66)");
	stmt.executeUpdate("insert into markseet values(6,'sachin',104,87,87,00)");
	stmt.executeUpdate("insert into markseet values(6,'ram',101,37,88,77)");
	stmt.executeUpdate("insert into markseet values(4,'shyam',90,84,84,47)");
	
	System.out.println("data inserted="+1);
	comm.commit();
		
	} catch (Exception e) {
		comm.rollback();
	   System.out.println(e);
	}
		
	}



}
