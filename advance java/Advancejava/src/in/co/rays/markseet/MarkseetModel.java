package in.co.rays.markseet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import in.co.rays.util.JDBCDataSource;

public class MarkseetModel {
	
	public void Add(MarkseetBean bean) throws Exception{
		
		Connection conn = JDBCDataSource.getConnection();
		
		PreparedStatement ps = conn.prepareStatement("insert into markseet values(?,?,?,?,?,?)");
		
		ps.setInt(1, nextPk());
		ps.setString(2, bean.name);
		ps.setInt(3, bean.rollno);
		ps.setInt(4, bean.physics);
		ps.setInt(5, bean.chemistry);
		ps.setInt(6, bean.maths);
		
		int i = ps.executeUpdate();
		System.out.println(i);
	}
	
	public void testUpdate(MarkseetBean bean )throws Exception{
		
		Connection conn = JDBCDataSource.getConnection();
		
		PreparedStatement ps = conn.prepareStatement("update markseet set name=?,roll_no=?,physics=?,chemistry=?,maths=? where id=?");
		
		ps.setString(1, bean.name);
		ps.setInt(2, bean.rollno);
		ps.setInt(3, bean.physics);
		ps.setInt(4, bean.chemistry);
		ps.setInt(5, bean.maths);
		ps.setInt(6, bean.id);
		
		int i = ps.executeUpdate();
		System.out.println("data pudated"+i);
		
	}
	
	public void testDelete(int id) throws Exception{
		
		Connection conn = JDBCDataSource.getConnection();
		
		PreparedStatement ps = conn.prepareStatement("delete from markseet where id=?");
		
		ps.setInt(1, id);
		
		int i = ps.executeUpdate();
		System.out.println(i);
	}
	
	public MarkseetBean findByRoll(int rollno)throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays","root","root");
		
		PreparedStatement ps = conn.prepareStatement("select * from markseet where roll_no=?");
		
		ps.setInt(1, rollno);
		
		ResultSet rs = ps.executeQuery();
		
		MarkseetBean bean = null;
		
		while (rs.next()) {
			
			bean = new MarkseetBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setRollno(rs.getInt(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemistry(rs.getInt(5));
			bean.setMaths(rs.getInt(6));
			
		}
		
		return bean;
		
	}
	public List search(MarkseetBean bean, int pageNo, int pageSize )throws Exception{
		

		Connection conn = JDBCDataSource.getConnection();
		StringBuffer sql = new StringBuffer("select * from markseet");
		
		if(bean !=null) {
			
			if(bean.getName()!=null && bean.getName().length()>0) { 
				
			sql.append(" and name like'" +bean.getName()+ "%'");
			}
			if(bean.getId()!=0 && bean.getId()>0) {
				
			sql.append(" and id =" +bean.getId());		
			}
			if(bean.getRollno()!=0 && bean.getRollno()>0) {
				
			sql.append(" and roll_no=" +bean.getRollno());	
			}
			if(bean.getPhysics()!=0 && bean.getPhysics()>0) {
				
			sql.append(" and physics=" +bean.getPhysics());
				
			}
			if(bean.getChemistry()!=0 && bean.getChemistry()>0) {
			
			sql.append(" and chemistry=" +bean.getChemistry());
				
			}
			if(bean.getMaths()!=0 && bean.getMaths()>0) {
				
			sql.append(" and maths=" +bean.getMaths());
			}
			
			if(pageSize>0) {
				pageNo =(pageNo - 1)* pageSize;
				sql.append(" limit "+pageNo+","+pageSize);
			}
		}
		System.out.println(sql.toString());
		
			
		PreparedStatement ps = conn.prepareStatement(sql.toString());
		
		ResultSet rs = ps.executeQuery();
		
		List list = new ArrayList();
		
		while (rs.next()) {
			
			bean = new MarkseetBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setRollno(rs.getInt(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemistry(rs.getInt(5));
			bean.setMaths(rs.getInt(6));
			
			list.add(bean);
			
			
		}
		
		return list;
	}
	public Integer nextPk()throws Exception{
		
		int pk=0;
		
		Connection conn = JDBCDataSource.getConnection();
		
		PreparedStatement ps = conn.prepareStatement("select max(id)from markseet");
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			
			pk=rs.getInt(1);
			
		}
		
		return pk+1;
		
	}

}

