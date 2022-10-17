package com.example.demo.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repo;
	
	public User addUser(User user) {
		
		try {
			user = repo.save(user);
			return user;
		}
		catch(Exception e) {
			return null;
		}
	}
	
	public User loginUser(String username, String password) {
		User u=repo.login(username, password);
		return u;
	}
}
