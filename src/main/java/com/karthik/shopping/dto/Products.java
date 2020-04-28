package com.karthik.shopping.dto;

import java.util.List;

import lombok.Data;

@Data
public class Products {
	public Products(List<Product> products) {
		this.products = products;
	}

	private List<Product> products;
}
