package com.maheshshittlani.dblearning.DBLearning.course.jpa;

import org.springframework.stereotype.Repository;

import com.maheshshittlani.dblearning.DBLearning.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJPARepository {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public void deleteById(int id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
	
	public Course findById(int id) {
		return entityManager.find(Course.class, id);
	}
}
