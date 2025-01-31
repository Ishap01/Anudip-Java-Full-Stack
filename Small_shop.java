package mypackage;

import java.util.Scanner;

public class Small_shop {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Product: ");
		String product=sc.nextLine();
		
		System.out.println("City: ");
		String city=sc.nextLine();
		
		System.out.println("Quantity: ");
		double quantity=sc.nextDouble();
		
		double price=0.0;
		
		if (city.equalsIgnoreCase("sofia")) {
			if (product.equals("coffee")) price = 0.50;
			else if (product.equals("water")) price = 0.80;
			else if (product.equals("beer")) price = 1.20;
			else if (product.equals("sweets")) price = 1.45;
			else if (product.equals("peanuts")) price = 1.60;
		} else if (city.equalsIgnoreCase("plovdiv")) {
			if (product.equals("coffee")) price = 0.40;
			else if (product.equals("water")) price = 0.70;
			else if (product.equals("beer")) price = 1.15;
			else if (product.equals("sweets")) price = 1.30;
			else if (product.equals("peanuts")) price = 1.50;
		} else if (city.equalsIgnoreCase("varna")) {
			if (product.equals("coffee")) price = 0.45;
			else if (product.equals("water")) price = 0.70;
			else if (product.equals("beer")) price = 1.10;
			else if (product.equals("sweets")) price = 1.35;
			else if (product.equals("peanuts")) price = 1.55;
		}
		
		double result = quantity * price;
		System.out.printf("%.2f%n", result);
		
		}
}
