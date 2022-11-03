package com.example.demo.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Item;
import com.example.demo.model.User;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{
	@Query("select i from Item i where i.publisher = :publisher_id")
	public ArrayList<Item> showLibrary(User publisher_id);
	
	@Query("select u from User u where u.username = :username and u.password = :password")
	public User findUser(String username, String password);

}
