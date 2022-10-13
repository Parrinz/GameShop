package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.AddUserDTO;
import com.example.demo.dto.response.UserDTO;
import com.example.demo.model.User;
import com.example.demo.servicies.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	
	@RequestMapping(method = RequestMethod.POST, path="/add")
	public ResponseEntity<UserDTO> addUser(@RequestBody AddUserDTO request){
		if(request.isValid()) {
			User u = new User(	request.getUsername(),
								request.getName(),
								request.getSurname(),
								request.getPassword());
			if(service.addUser(u)!=null) {
				return ResponseEntity.status(HttpStatus.OK).build();
			}
			else {
				return ResponseEntity.status(HttpStatus.CONFLICT).build();
			}
		}
		else {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		}
	}
}
