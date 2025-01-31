package mypackage;

import java.util.Scanner;

public class Fruit_shop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Fruit: ");
		String fruit=sc.nextLine();
		
		System.out.println("Day of the week: ");
		String day=sc.nextLine();
		
		System.out.println("Quantity: ");
		double quantity=sc.nextDouble();
		
		double price=0.0;
		 
		if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
			if (fruit.equals("banana")) price = 2.50;
			else if (fruit.equals("apple")) price = 1.20;
			else if (fruit.equals("orange")) price = 0.85;
			else if (fruit.equals("grapefruit")) price = 1.45;
			else if (fruit.equals("kiwi")) price = 2.70;
			else if (fruit.equals("pineapple")) price = 5.50;
			else if (fruit.equals("grapes")) price = 3.85;
		} else if (day.equals("saturday") || day.equals("sunday")) {
			if (fruit.equals("banana")) price = 2.70;
			else if (fruit.equals("apple")) price = 1.25;
			else if (fruit.equals("orange")) price = 0.90;
			else if (fruit.equals("grapefruit")) price = 1.60;
			else if (fruit.equals("kiwi")) price = 3.00;
			else if (fruit.equals("pineapple")) price = 5.60;
			else if (fruit.equals("grapes")) price = 4.20;
		}
		
		double result = quantity * price;
		System.out.printf("%.2f%n", result);
	}
}
