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
		if(!repo.cercaUsername(user.getUsername())) {
		try {
			user = repo.save(user);
			return user;
		}
		catch(Exception e) {
			return null;
		}
		}else return null;
	}
}
