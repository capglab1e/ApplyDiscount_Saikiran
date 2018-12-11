package com.cg.capstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.capstore.dto.Category;
import com.cg.capstore.dto.Product;

@Repository("dao")
public class CapStoreDaoImpl implements ICapstoreDao{
	@PersistenceContext
	EntityManager em;

	@Override
	public List<Product> getAllProductDetails(Product p) {
		// TODO Auto-generated method stub
		Query qry = em.createQuery("FROM Product");
	    List<Product> li = qry.getResultList();
	    return li;
		
	}

	@Override
	public List<Category> getAllCategoryDetails(Category c) {
		// TODO Auto-generated method stub
		Query qry = em.createQuery("FROM Category");
	    List<Category> li = qry.getResultList();
	  // System.out.println(li);
	    return li;
	}

	@Override
	public Product search(String pId) {
		// TODO Auto-generated method stub
		Product p=em.find(Product.class, pId);
		return p;
	}

}
