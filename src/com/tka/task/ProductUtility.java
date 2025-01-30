package com.tka.task;

import java.util.Scanner;

public class ProductUtility {

	static Scanner  scanner = new Scanner(System.in);

	public static Product prepareProduct() {

		System.out.println("Enetr Product Id");
		int id = scanner.nextInt();

		System.out.println("Enter Product Name");
		String name = scanner.next();

		System.out.println("Enter Product QTY");
		int qty = scanner.nextInt();

		System.out.println("Enter Product Price");
		double price = scanner.nextDouble();

		System.out.println("Enter MFG Date");
		String mfgDate = scanner.next();

		System.out.println("Enter EXP Date");
		String expDate = scanner.next();

		Product product = new Product(id, name, qty, price, mfgDate, expDate);

		return product;

	}

}
