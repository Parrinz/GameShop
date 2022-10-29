package com.example.demo.dto.response;

import com.example.demo.model.User;

public class UserDTO {
	private String username;
	private String name;
	private String surname;
	private UserType userType;
	
	private enum UserType{
		SIMPLE,
		PUBLISHER
	}
	
	public UserDTO() {
	}
	
	public UserDTO(User u) {
		this.username = u.getUsername();
		this.name = u.getName();
		this.surname = u.getSurname();
		switch (u.getUserType()) {
		case 0:
			this.userType = UserType.SIMPLE;
			break;
		case 1:
			this.userType = UserType.PUBLISHER;
			break;
		}
		
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
	
	public UserType getUserType() {
		return userType;
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

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
	
	
	
}
