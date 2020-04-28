package com.karthik.shopping.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.shopping.dto.Product;
import com.karthik.shopping.dto.Products;

@RestController
@RequestMapping(path = "/cart")
public class CartController {

	@CrossOrigin
	@GetMapping(value = "/productsInCart/{userId}")
	private Products getProductsInCart(@PathVariable String userId) {
		Product product1 = new Product("Apple", "a", 12d);
		Product product2 = new Product("Orange", "o", 3d);
		Product product3 = new Product("Cola", "a", 5d);
		Product product4 = new Product("Toilet Paper", "s", 30d);
		List<Product> productInCart = new ArrayList<>();
		productInCart.add(product1);
		productInCart.add(product2);
		productInCart.add(product3);
		productInCart.add(product4);
		return new Products(productInCart);
	}
}
