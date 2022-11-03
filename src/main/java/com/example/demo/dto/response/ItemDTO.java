package com.example.demo.dto.response;

import java.time.LocalDate;

import com.example.demo.model.User;

public class ItemDTO {
	private String name;
	private int itemType;
	private LocalDate publishDate;
    private User publisher;
    
	public ItemDTO(String name, int itemType, LocalDate publishDate, User publisher) {
		this.name = name;
		this.itemType = itemType;
		this.publishDate = publishDate;
		this.publisher = publisher;
	}

	public String getName() {
		return name;
	}

	public int getItemType() {
		return itemType;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public User getPublisher() {
		return publisher;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setItemType(int itemType) {
		this.itemType = itemType;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public void setPublisher(User publisher) {
		this.publisher = publisher;
	}
    
    
}
