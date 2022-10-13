package com.example.demo.dto.response;

import com.example.demo.model.User;

public class UserDTO {
	private String username;
	private String name;
	private String surname;
	
	
	
	public UserDTO() {
	}
	
	public UserDTO(User u) {
		this.username = u.getUsername();
		this.name = u.getName();
		this.surname = u.getSurname();
	}

	public String getUsername() {
		return username;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	
}
