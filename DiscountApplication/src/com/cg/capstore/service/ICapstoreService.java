package com.cg.capstore.service;

import java.util.List;

import com.cg.capstore.dto.Category;
import com.cg.capstore.dto.Product;

public interface ICapstoreService {
	public List<Product> getAllProductDetails(Product p);
	   public List<Category> getAllCategoryDetails(Category c);
	   public Product search(String pId);
}
