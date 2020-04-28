package com.karthik.shopping.dto;

import lombok.Data;

@Data
public class Product {

	public Product() {
	}

	public Product(String name, String description, Double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}

	private String name;
	private String description;
	private Double price;
}
