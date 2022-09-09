package com.productapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
@Entity
public class Category {
	
	@Id
	@GeneratedValue(generator ="cat_Id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name="cat_Id",sequenceName = "category_Id",initialValue =1 ,allocationSize = 1)
	
	
	private String categoryId;
	private String categoryName;
	
	@ManyToMany
	Set<Product>products;

}
