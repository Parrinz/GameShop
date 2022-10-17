package com.example.demo.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class LoginUserDTO {
	private String username;
	private String password;
	
	
	public LoginUserDTO() {
	}
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@JsonIgnore
	public boolean isValid() {
		return username!=null && !username.isBlank() && !username.isEmpty() &&
				password!=null && !password.isBlank() && !password.isEmpty();
	}
	
}
