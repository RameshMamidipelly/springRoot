package bean;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	private String driver_name;
	private String url;
	private String username;
	private String password;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String driver_name, String url, String username, String password) {
		super();
		this.driver_name = driver_name;
		this.url = url;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [driver_name=" + driver_name + ", url=" + url + ", username=" + username + ", password="
				+ password + "]";
	}
	
	public String getDriver_name() {
		return driver_name;
	}
	@Required
	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}
	public String getPassword() {
		return password;
	}
	@Required
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	@Required
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	@Required
	public void setUsername(String username) {
		this.username = username;
	}
	 
	
}
