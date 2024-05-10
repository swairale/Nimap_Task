package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.CategoryDao;
import com.demo.model.Category;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CategeryServiceImpl implements CategeryService {
	
	@Autowired
	private CategoryDao cd;

	@Override
	public Category save(Category c) {
		return cd.save(c);
	}

	@Override
	public List<Category> findAll() {
		return cd.findAll();
	}

	@Override
	public Category findById(int id) {
		return cd.findById(id);
	}

	@Override
	public int deleteById(int id) {
		 return cd.deleteById(id);
	}

}
