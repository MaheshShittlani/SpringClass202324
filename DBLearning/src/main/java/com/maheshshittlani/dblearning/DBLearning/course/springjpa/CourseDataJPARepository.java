package com.maheshshittlani.dblearning.DBLearning.course.springjpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maheshshittlani.dblearning.DBLearning.Course;
import java.util.List;


@Repository
public interface CourseDataJPARepository extends JpaRepository<Course, Integer> {
	List<Course> findByTitle(String title);
	List<Course> findByDurationOrderByTitle(String duration);
}
