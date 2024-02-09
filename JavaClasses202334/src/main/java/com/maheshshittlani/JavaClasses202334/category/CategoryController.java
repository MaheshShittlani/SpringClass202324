package com.maheshshittlani.JavaClasses202334.category;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Ecommerce
	------------------
	Category
		- id
		- title
		- image
		- description
		- status ('Inactive','Active')
		- created_at
		- updated_at
	
	
	todo/index -> List all todos (First page for todo managment)
	todo/create -> Create new todo 
	
	------------------------------------------------------
	(Recommande)
	GET	/todos -> Fetch All Category
	GET	/todos/create -> Show the page to create new todos
	POST	/todos -> Create New Category
	GET	/todos/{id} -> Fetch one category by id
	PUT	/todos/{id} -> Update one category by id
	DELETE /todos/{id} -> Delete one category by id	
	
	
	------------------------------------------
	GET	/list-todos
	POST	/create-todo
	GET	/get-todo/{id}
	POST	/update-todo/{id}
	POST	/delete-todo/{id}
 */

@Controller
@SessionAttributes(names = "email")
public class CategoryController {
	
	private CategoryService  categoryService;
	
	public CategoryController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}



	@RequestMapping(value = "categories", method = RequestMethod.GET)
	public String list(ModelMap model) {
		List<Category> categories =  categoryService.findAll();
		model.put("categories", categories);
		return "categories/index";
	}
	
	@RequestMapping(value = "categories/create", method =  RequestMethod.GET)
	public String create() {
		return "categories/create";
	}
	
	@RequestMapping(value = "categories", method = RequestMethod.POST)
	public String store(@RequestParam String title, @RequestParam String imageURL, @RequestParam String description) {
		categoryService.create(new Category(++CategoryService.count, title, imageURL, description, true, LocalDate.now(), LocalDate.now()));
		return "redirect:categories";
	}
}
