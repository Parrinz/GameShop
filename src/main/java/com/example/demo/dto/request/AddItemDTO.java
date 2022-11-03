package com.example.demo.dto.request;

import java.time.LocalDate;

import com.example.demo.model.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class AddItemDTO {
	private String name;
	private int itemType;
	private LocalDate publishDate;
    private String publisherUsername;
    private String publisherPassword;
    
	public AddItemDTO() {
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

	public String getPublisherUsername() {
		return publisherUsername;
	}

	public String getPublisherPassword() {
		return publisherPassword;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setItemType(int itemType) {
		if(itemType >= 1 && itemType <= 5) {
			this.itemType = itemType;
		}
		else {
			this.itemType = -1;
		}
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public void setPublisherUsername(String publisherUsername) {
		this.publisherUsername = publisherUsername;
	}

	public void setPublisherPassword(String publisherPassword) {
		this.publisherPassword = publisherPassword;
	}
	
	@JsonIgnore
	public boolean isValid() {
		return name!=null && !name.isBlank() && !name.isEmpty()
				&& publishDate.isBefore(LocalDate.now()) && !publishDate.toString().isBlank() && !publishDate.toString().isEmpty()
				&& itemType != -1;
	}
}
