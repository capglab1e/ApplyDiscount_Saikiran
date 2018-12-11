package com.cg.capstore.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cat")
public class Category {
	@Id
	@Column(name="category_id")
 private String catId;
	@Column(name="discount_persent")
 private double discPercent;
	@Column(name="category_name")
 private String catName;
public String getCatId() {
	return catId;
}
public void setCatId(String catId) {
	this.catId = catId;
}
public double getDiscPercent() {
	return discPercent;
}
public void setDiscPercent(double discPercent) {
	this.discPercent = discPercent;
}
public String getCatName() {
	return catName;
}
public void setCatName(String catName) {
	this.catName = catName;
}
public Category() {
	super();
	// TODO Auto-generated constructor stub
}
public Category(String catId, double discPercent, String catName) {
	super();
	this.catId = catId;
	this.discPercent = discPercent;
	this.catName = catName;
}
@Override
public String toString() {
	return "Category [catId=" + catId + ", discPercent=" + discPercent
			+ ", catName=" + catName + "]";
}
 
}
