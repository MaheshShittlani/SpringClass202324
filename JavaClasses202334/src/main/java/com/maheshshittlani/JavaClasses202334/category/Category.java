package com.maheshshittlani.JavaClasses202334.category;

import java.time.LocalDate;

public class Category {
	private int id;
	private String title;
	private String imageURL;
	private String description;
	private boolean status;
	private LocalDate createdAt;
	private LocalDate updateAt;
	
	
	public Category(int id, String title, String imageURL, String description, boolean status, LocalDate createdAt,
			LocalDate updateAt) {
		super();
		this.id = id;
		this.title = title;
		this.imageURL = imageURL;
		this.description = description;
		this.status = status;
		this.createdAt = createdAt;
		this.updateAt = updateAt;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getImageURL() {
		return imageURL;
	}


	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public LocalDate getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}


	public LocalDate getUpdateAt() {
		return updateAt;
	}


	public void setUpdateAt(LocalDate updateAt) {
		this.updateAt = updateAt;
	}


	@Override
	public String toString() {
		return "Category [id=" + id + ", title=" + title + ", imageURL=" + imageURL + ", description=" + description
				+ ", status=" + status + ", createdAt=" + createdAt + ", updateAt=" + updateAt + "]";
	}
}
