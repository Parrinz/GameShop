package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false)
	private String username;
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String cognome;
	@Column(nullable=false)
	private String password;
	
	public User() {
	}
	
	

	public User(int id, String username, String nome, String cognome, String password) {
		this.id = id;
		this.username = username;
		this.nome = nome;
		this.cognome = cognome;
		this.password = password;
	}



	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getPassword() {
		return password;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
