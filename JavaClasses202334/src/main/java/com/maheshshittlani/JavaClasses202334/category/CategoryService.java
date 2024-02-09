package com.maheshshittlani.JavaClasses202334.category;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CategoryService {
	
	private static List<Category> categories = new ArrayList<Category>();
	public static int count = 0;
	static {
		categories.add(new Category(++count, "Shoes", "", "Shoes for Kids", true, LocalDate.now().plusDays(1), LocalDate.now().plusDays(2)));
		categories.add(new Category(++count, "Clothing", "", "Clothis for All", true, LocalDate.now().plusDays(1), LocalDate.now().plusDays(2)));
		categories.add(new Category(++count, "Electornics", "", "Electronic Items", true, LocalDate.now().plusDays(1), LocalDate.now().plusDays(2)));
	}
	
	public List<Category> findAll() {
		return categories;
	}
	
	public void create(Category category) {
		categories.add(category);
	}
}
