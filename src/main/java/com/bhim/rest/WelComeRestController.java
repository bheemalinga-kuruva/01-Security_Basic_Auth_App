package com.bhim.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhim.model.Product;

@RestController
public class WelComeRestController {

	@GetMapping("/welcome")
	public String welcomeMsg() {
		String msg="Wel come to Andhra Pradesh";
		return msg;
	}
	@GetMapping("/contact")
	public String getContact() {
		Long  contact=9876543210L;
		return "contact number"+contact;
	}
	@GetMapping("/products")
	public Product getProducts() {
	Product product= new Product();
	product.setProductId(101);
	product.setProductName("laptop");
	product.setProductPrice(249.0);
	return product;
}
}
