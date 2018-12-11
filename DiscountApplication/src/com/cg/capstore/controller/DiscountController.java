package com.cg.capstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.capstore.dto.Category;
import com.cg.capstore.dto.Product;
import com.cg.capstore.service.ICapstoreService;

@Controller
public class DiscountController {
   
	@Autowired
	ICapstoreService service;
	
	@RequestMapping(value="all")
	public String getAll(@ModelAttribute("my") Product p){
		return "home";
	}
	
	@RequestMapping(value="discount")
	public ModelAndView calDiscount(@ModelAttribute("my") Product p){
		Category c = null;
		double finalPrice=0;
		Product pr=service.search(p.getProdId());
      // System.out.println(pr);
		String id = pr.getCatId();
		System.out.println(id);
	  
	    List<Category> li = service.getAllCategoryDetails(c);
	 //  System.out.println(li);
	    
	    for (Category category : li) {
	    	System.out.println(category.getCatId());
			if(category.getCatId().equals(id)){
				
				double d = category.getDiscPercent();
		
				double price = pr.getProdPrice();
				finalPrice = (price-((d/100)*price));
			}
		}
	   return new ModelAndView("success","fp",finalPrice);
	}

}
