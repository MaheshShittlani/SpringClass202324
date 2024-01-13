package com.maheshshittlani.dblearning.DBLearning;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "courses")
public class Course {
	@Id
	private int id;
	private String title;
	private String duration;

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int id, String title, String duration) {
		super();
		this.id = id;
		this.title = title;
		this.duration = duration;
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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", duration=" + duration + "]";
	}
}
