package in.co.rays.user;

import java.util.Date;

public class UserBean {
	
	private int id = 0;
	private String fist_name = null;
	private String last_name = null;
	private String login_id = null;
	private String password = null;
	private Date dob = null;
	private String address = null;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFist_name() {
		return fist_name;
	}
	public void setFist_name(String fist_name) {
		this.fist_name = fist_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
