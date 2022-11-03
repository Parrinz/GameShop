package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private int itemType;
	@Column(nullable = false)
	private LocalDate publishDate;
	@ManyToOne
    @JoinColumn(name="publisher_id", nullable=false)
    private User publisher;
	
	public Item() {
	}
	
	

	public Item(long id, String name, int itemType, LocalDate publishDate, User publisher) {
		this.id = id;
		this.name = name;
		this.itemType = itemType;
		this.publishDate = publishDate;
		this.publisher = publisher;
	}

	

	public Item(String name, int itemType, LocalDate publishDate, User publisher) {
		this.name = name;
		this.itemType = itemType;
		this.publishDate = publishDate;
		this.publisher = publisher;
	}



	public long getId() {
		return id;
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

	public void setId(long id) {
		this.id = id;
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
