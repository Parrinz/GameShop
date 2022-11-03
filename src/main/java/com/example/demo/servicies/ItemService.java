package com.example.demo.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Item;
import com.example.demo.model.User;
import com.example.demo.repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	ItemRepository repo;
	
	public Item addItem(Item item) {
		try {
			item = repo.save(item);
			return item;
		}
		catch(Exception e) {
			return null;
		}
	}
	
	public User findUser(String username, String password) {
		User u=repo.findUser(username, password);
		return u;
	}
}
