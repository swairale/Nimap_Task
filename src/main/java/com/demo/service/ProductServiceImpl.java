package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao pd;

	@Override
	public Product save(Product p) {
		return pd.save(p);
	}

	@Override
	public List<Product> findAll() {
		return pd.findAll();
	}

	@Override
	public Product findById(int id) {
		return pd.findById(id);
	}

	@Override
	public int deleteById(int id) {
		return pd.deleteById(id);
	}

}