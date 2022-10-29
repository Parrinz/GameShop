package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String username;
	@Column(nullable = false, unique = true)
	private String name;
	@Column(nullable = false)
	private String surname;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private int userType;
	
	public User() {
	}
	

	public User(int id, String username, String name, String surname, String password, int userType) {
		this.id = id;
		this.username = username;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.userType = userType;
	}

	

	public User(String username, String name, String surname, String password, int userType) {
		this.username = username;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.userType = userType;
	}

	

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}


	public long getId() {
		return id;
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
	
	public int getUserType() {
		return userType;
	}
	
	

	public void setId(long id) {
		this.id = id;
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
	
	public void setUserType(int userType) {
		this.userType = userType;
	}
}
