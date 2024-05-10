package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.service.ProductService;


@RestController
public class ProductContoller {
	
	@Autowired
	private ProductService ps;
	
	@PostMapping(value="/save")
	public Product p1(@RequestBody Product p )
	{
		return ps.save(p);
	}
	
	@GetMapping(value="/all")
	public List<Product> find()
	{
		return ps.findAll();
	}
	

	@PostMapping(value="/update")
	public Product update(@RequestBody Product p)
	{
		return ps.save(p);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public int delete(@PathVariable int id)
	{
		return ps.deleteById(id);
	}
	
	@GetMapping(value="/findbyid/{id}")
	public Product findById(@PathVariable int id)
	{
		return ps.findById(id);
	}


}
