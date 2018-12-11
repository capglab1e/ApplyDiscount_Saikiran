package com.cg.capstore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.capstore.dao.ICapstoreDao;
import com.cg.capstore.dto.Category;
import com.cg.capstore.dto.Product;

@Service("service")
@Transactional

public class CapStoreServiceImpl implements ICapstoreService {
    
	@Autowired
	ICapstoreDao dao;

	@Override
	public List<Product> getAllProductDetails(Product p) {
		// TODO Auto-generated method stub
		return dao.getAllProductDetails(p);
	}

	@Override
	public List<Category> getAllCategoryDetails(Category c) {
		// TODO Auto-generated method stub
		return dao.getAllCategoryDetails(c);
	}

	@Override
	public Product search(String pId) {
		// TODO Auto-generated method stub
		return dao.search(pId);
	}

}
