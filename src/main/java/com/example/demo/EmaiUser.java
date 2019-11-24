package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * @author ADMIN
 *
 */
@Component
public class EmaiUser {

	
	private String username;
	private String password;
	public EmaiUser(String string, String string2) {
		// TODO Auto-generated constructor stub
		username=string;
		password=string2;
	}
	
	public EmaiUser() {
		// TODO Auto-generated constructor stub
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
