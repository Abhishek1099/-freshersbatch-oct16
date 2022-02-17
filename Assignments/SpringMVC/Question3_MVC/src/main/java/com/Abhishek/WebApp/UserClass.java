package com.Abhishek.WebApp;


import javax.validation.constraints.Size;

public class UserClass {

	@Size(min=2,max = 10)
	String username;
	String password;
	String email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
