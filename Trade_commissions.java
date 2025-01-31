package mypackage;

import java.util.Scanner;

public class Trade_commisions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the City: ");
		String city=sc.nextLine();
		
		System.out.println("Enter the volumes of sales: ");
		double s=sc.nextDouble();
		sc.close();
		
		double commission = 0;
		
		if (s < 0) {
			System.out.println("error");
			return;
		}
		if (city.equalsIgnoreCase("Sofia")) {
			if (s >= 0 && s <= 500) commission = 0.05;
			else if (s > 500 && s <= 1000) commission = 0.07;
			else if (s > 1000 && s <= 10000) commission = 0.08;
			else commission = 0.12;
			
		} else if (city.equalsIgnoreCase("Varna")) {
			if (s >= 0 && s <= 500) commission = 0.045;
			else if (s > 500 && s <= 1000) commission = 0.075;
			else if (s > 1000 && s <= 10000) commission = 0.10;
			else commission = 0.13;
			
		} else if (city.equalsIgnoreCase("Plovdiv")) {
			if (s >= 0 && s <= 500) commission = 0.055;
			else if (s > 500 && s <= 1000) commission = 0.08;
			else if (s > 1000 && s <= 10000) commission = 0.12;
			else commission = 0.145;
		} else {
			System.out.println("error");
			return;
		}
		
		double result = s * commission;
		System.out.printf("%.2f%n", result);
	}
		
}
