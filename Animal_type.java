package mypackage;

import java.util.Scanner;

public class Animal_type {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Animal: ");
		String Animal=sc.next().toLowerCase();
		
		if (Animal.equalsIgnoreCase("dog")) {
			System.out.println("Mammal");
		}
		else if(Animal.equalsIgnoreCase("crocodile") || Animal.equalsIgnoreCase("tortoise") || Animal.equalsIgnoreCase("snake"))
		{
			System.out.println("Reptile");
		}
		else {
			System.out.println("Others");
		}
		sc.close();
	}
	
}
