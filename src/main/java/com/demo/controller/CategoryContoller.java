package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Category;
import com.demo.model.Product;
import com.demo.service.CategeryService;
import com.demo.service.ProductService;

@RestController
public class CategoryContoller {
	@Autowired
	private CategeryService cs;
	
	@PostMapping(value="/new")
	public Category p1(@RequestBody Category c)
	{
		return cs.save(c);
	}
	
	@GetMapping(value="/allcat")
	public List<Category> find()
	{
		return cs.findAll();
	}
	

	@PostMapping(value="/updatecat")
	public Category update(@RequestBody Category p)
	{
		return cs.save(p);
	}
	
	@DeleteMapping(value="/deletecat/{id}")
	public int  delete(@PathVariable int id)
	{
		return cs.deleteById(id);
	}
	
	@GetMapping(value="/findbyidcat/{id}")
	public Category findById(@PathVariable int id)
	{
		return cs.findById(id);
	}



}
