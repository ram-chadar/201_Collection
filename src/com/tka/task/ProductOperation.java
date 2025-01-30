package com.tka.task;

import java.util.ArrayList;
import java.util.List;

public class ProductOperation {

	List<Product> list = new ArrayList<Product>();

	public String addProduct(Product product) {

		list.add(product);
		return "Product Added Successfully !";

	}

	public Object getAllProduct() {	
		try {
			if(list.isEmpty()) {
				return "Product not exists in list";
			}else {
				return list;
			}
		} catch (Exception e) {
			return  "Something went  wrong";
		}	
	}
}
