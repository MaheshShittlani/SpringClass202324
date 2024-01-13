package com.maheshshittlani.dblearning.DBLearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.maheshshittlani.dblearning.DBLearning.course.jpa.CourseJPARepository;
import com.maheshshittlani.dblearning.DBLearning.course.springjpa.CourseDataJPARepository;

@Component
public class DBCommandLineRunner implements CommandLineRunner {
	
	@Autowired
//	CourseJdbcRepository courseJdbcRepository;
//	CourseJPARepository courseJPARepository;
	CourseDataJPARepository courseDataJPARepository;
	
	
	@Override
	public void run(String... args) throws Exception {
//		courseDataJPARepository.save(new Course(4, "Node JS", "90 hours"));
		
//		courseJdbcRepository.deleteById(2);
		
		
//		System.out.println(courseJdbcRepository.findById(1));
//		System.out.println(courseJdbcRepository.findById(2));
		
		System.out.println(courseDataJPARepository.findAll());
		
	}

}
