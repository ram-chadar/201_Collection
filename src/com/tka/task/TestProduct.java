package com.tka.task;

import java.util.List;
import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {

		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		ProductOperation operation = new ProductOperation();

		do {
			System.out.println("1. Add Product");
			System.out.println("2. Get Specific Product");
			System.out.println("3. Get All Product");

			System.out.println("0. To Terminate Application");

			System.out.println("Enter your choice");
			choice = scanner.nextInt();

			switch (choice) {

			case 0: {
				choice = 0;
				break;
			}

			case 1: {
				Product product = ProductUtility.prepareProduct();
				String msg = operation.addProduct(product);
				System.out.println(msg);
				break;
			}

			case 2: {
				System.out.println("pressed 2");
				break;
			}

			case 3: {

				Object obj = operation.getAllProduct();

				if (obj instanceof String) {
					System.out.println(obj);
				} else {
					List<Product> list = (List<Product>) obj;
					for (Product product : list) {
						System.out.println(product);
					}
				}
				break;
			}
			default:
				choice = 0;
			}
		} while (choice != 0);

		System.out.println("Application Terminated");

	}

}
