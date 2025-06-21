package com.ecommerce.search;

public class Main {

	public static void main(String[] args) {
		Product[] products = {
	            new Product(1, "Laptop", "Electronics"),
	            new Product(2, "Book", "Education"),
	            new Product(3, "Shoes", "Fashion")
	        };

	        Product result1 = Search.linearSearch(products, "Shoes");
	        System.out.println("Linear Search Result: " + (result1 != null ? result1.productName : "Not Found"));

	        Product result2 = Search.binarySearch(products, "Book");
	        System.out.println("Binary Search Result: " + (result2 != null ? result2.productName : "Not Found"));
	}

}
