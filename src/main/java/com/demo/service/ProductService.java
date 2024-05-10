package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {
	
	Product save(Product p);

	List<Product> findAll();

	Product findById(int id);

	int deleteById(int id);

}
