package com.productapp.model;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.criteria.Join;

@Entity
public class Product {
	
	
	@Id
	@GeneratedValue(generator ="cat_Id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="cat_Id",sequenceName = "category_Id",initialValue =1 ,allocationSize = 1)
	
	
	private String productName;
	private Integer productId;
	
	
	@ManyToMany(cascade=CascadeType.MERGE,fetch = FetchType.EAGER)
	@JoinTable(name="product_category")
	Set<Category>category;
	
	@OneToOne
	@JoinColumn(name="category_Id")
	ProductDetails productDetails;
	
	
	

}
