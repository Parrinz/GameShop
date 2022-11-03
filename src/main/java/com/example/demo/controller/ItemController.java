package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.request.AddItemDTO;
import com.example.demo.dto.response.ItemDTO;
import com.example.demo.model.Item;
import com.example.demo.servicies.ItemService;

@RestController
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private ItemService service;
	
	@RequestMapping(method = RequestMethod.POST, path="/add")
	public ResponseEntity<ItemDTO> addItem(@RequestBody AddItemDTO request){
		if(request.isValid()) {
			Item i = new Item(	request.getName(),
								request.getItemType(),
								request.getPublishDate(),
								service.findUser(request.getPublisherUsername(), request.getPublisherPassword()));
			if(service.addItem(i)!=null) {
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
