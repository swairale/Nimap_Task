package com.demo.service;

import java.util.List;

import com.demo.model.Category;

public interface CategeryService {
	
	Category save(Category p);
	
	 List<Category> findAll();
	 
	 Category findById(int id);
	 
	 int deleteById(int id);


}
