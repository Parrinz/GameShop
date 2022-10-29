package com.example.demo.dto.request;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class AddUserDTO {
	
	private String username;
	private String name;
	private String surname;
	private String password;
	private String passwordRepeated;
	private int userType;
	
	public AddUserDTO() {
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

	public String getPassword() {
		return password;
	}

	public String getPasswordRepeated() {
		return passwordRepeated;
	}
	
	public int getUserType() {
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

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPasswordRepeated(String passwordRepeated) {
		this.passwordRepeated = passwordRepeated;
	}

	public void setUserType(int userType) {
		if(userType == 0 || userType == 1) {
			this.userType = userType;
		}
		else {
			this.userType = -1;
		}
	}

	@JsonIgnore
	public boolean isValid() {
		return name!=null && !name.isBlank() && !name.isEmpty()
				&& surname!=null && !surname.isBlank() && !surname.isEmpty()
				&& username!=null && !username.isBlank() && !username.isEmpty()
				&& password!=null && !password.isBlank() && !password.isEmpty() && password.equals(passwordRepeated)
				&& userType!=-1;
	}
	
}
