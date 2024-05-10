package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.demo.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{
	
	 Product save(Product p);
	
	 List<Product> findAll();
	 
	 Product findById(int id);
	 
	 int deleteById(int id);
	 
	 
	 }
