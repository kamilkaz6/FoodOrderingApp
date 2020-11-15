package com.ztus;

import java.io.Serializable;


public class Customer implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String email;
	private String password;
	
	public Customer() {
		this.email = "";
		this.password= "";
	}
	
	public Customer(String email, String password) {
		this.email = email;
		this.password= password;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
