package com.cg.capstore.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name="prod_id")
  private String prodId;
	 @Column(name="category_id")
  private String catId;
	 @Column(name="price")
  private double prodPrice;
	 @Column(name="prod_name")
  private String prodName;
	 @Column(name="description")
	 private String desc;
	 @Column(name="subcategory_id")
	 private String subCatId;
	 @Column(name="qty_supplied")
	 private int qtSupplied;
	 @Column(name="qty_available")
	 private int qtAvailable;
	 @Column(name="merchant_id")
	 private String merId;
	 @Column(name="rating")
	 private int rating;
	 
public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getSubCatId() {
		return subCatId;
	}
	public void setSubCatId(String subCatId) {
		this.subCatId = subCatId;
	}
	public int getQtSupplied() {
		return qtSupplied;
	}
	public void setQtSupplied(int qtSupplied) {
		this.qtSupplied = qtSupplied;
	}
	public int getQtAvailable() {
		return qtAvailable;
	}
	public void setQtAvailable(int qtAvailable) {
		this.qtAvailable = qtAvailable;
	}
	public String getMerId() {
		return merId;
	}
	public void setMerId(String merId) {
		this.merId = merId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
public String getProdId() {
	return prodId;
}
public void setProdId(String prodId) {
	this.prodId = prodId;
}
public String getCatId() {
	return catId;
}
public void setCatId(String catId) {
	this.catId = catId;
}
public double getProdPrice() {
	return prodPrice;
}
public void setProdPrice(double prodPrice) {
	this.prodPrice = prodPrice;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public Product(String prodId, String catId, double prodPrice, String prodName,
		String desc, String subCatId, int qtSupplied, int qtAvailable,
		String merId, int rating) {
	super();
	this.prodId = prodId;
	this.catId = catId;
	this.prodPrice = prodPrice;
	this.prodName = prodName;
	this.desc = desc;
	this.subCatId = subCatId;
	this.qtSupplied = qtSupplied;
	this.qtAvailable = qtAvailable;
	this.merId = merId;
	this.rating = rating;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Product [prodId=" + prodId + ", catId=" + catId + ", prodPrice="
			+ prodPrice + ", prodName=" + prodName + ", desc=" + desc
			+ ", subCatId=" + subCatId + ", qtSupplied=" + qtSupplied
			+ ", qtAvailable=" + qtAvailable + ", merId=" + merId + ", rating="
			+ rating + "]";
}

}