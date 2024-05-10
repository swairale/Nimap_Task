package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Category;
import com.demo.model.Product;

@Repository
public interface CategoryDao extends JpaRepository<Category, Integer>{
	
	Category save(Category p);
	
	 List<Category> findAll();
	 
	 Category findById(int id);
	 
	 int deleteById(int id);;

}
