package com.maheshshittlani.dblearning.DBLearning.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.maheshshittlani.dblearning.DBLearning.Course;

@Repository
public class CourseJdbcRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	String INSERT_QUERY = "INSERT INTO courses (id, title, duration) VALUES (?,?,?)";
	String DELETE_QUERY = "DELETE FROM courses where id = ?";
	String SELECT_QUERY = "SELECT * FROM courses where id = ?";
	
	public void insert(Course course) {
		jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getTitle(), course.getDuration());
	}
	
	
	public void deleteById(int id) {
		jdbcTemplate.update(DELETE_QUERY, id);
	}
	
	public Course findById(int id) {
		// ResultSet -> Row mapping with Course Bean
		return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
	}
	
}
