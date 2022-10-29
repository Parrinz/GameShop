package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.AddUserDTO;
import com.example.demo.dto.request.LoginUserDTO;
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
								request.getPassword(),
								request.getUserType());
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
	
	
	@RequestMapping(method = RequestMethod.POST, path = "/login")
	public ResponseEntity<UserDTO> login(@RequestBody LoginUserDTO request) {
		if(request.isValid()) {
			User user = service.loginUser(request.getUsername(), request.getPassword());
			if(user != null) {
				return ResponseEntity.status(HttpStatus.OK).body(new UserDTO(user));
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
