package jp.co.aforce.bean;

public class Client implements java.io.Serializable{
	
	private int id;
	private String identity; // 将属性名 login 改为 identity
	private String password;
	
	

	public int getId() {
		return id;
	}
	
	public String getIdentity() { // 将方法名 getLogin 改为 getIdentity
		return identity;
	}
	
	
	
	public String getPassword() {
		return password;
	}
	
	
	

	public void setId(int id) {
		this.id=id;
	}
	
	
	public void setIdentity(String identity) { // 将方法名 setLogin 改为 setIdentity
		this.identity=identity;
		
		
	}
	
	
	public void setPassword(String password) {
		
		this.password=password;
	}
}
