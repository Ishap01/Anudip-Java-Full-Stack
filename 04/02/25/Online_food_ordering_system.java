package mypackage;

import java.util.Scanner;

public class Online_food_ordering_system {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, choice1, quantity;
		String ans;
		double totalbill = 0;
		
		System.out.println("WELCOME TO MY HOTEL");
		
		do {
			System.out.println("\nMenu Categories: \n 1. Starters\n 2. Main Course\n 3. Deserts\n 4. Drinks\n");
			System.out.println("Enter your choice: ");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Starters Menu:");
                System.out.println("1: Spring Rolls - 120 Rs.");
                System.out.println("2: Paneer Tikka - 150 Rs.");
                System.out.println("3: Chicken chilli - 200 Rs.");
                System.out.println("4: Paneer Chilli - 100 Rs.");
                System.out.println("5: Chicken Nuggets - 130 Rs.");
                System.out.println("Select an item: ");
                choice1=sc.nextInt();
                System.out.println("Enter the quantity: ");
                quantity=sc.nextInt();
                
                if (choice == 1) totalbill += 120 * quantity;
                else if (choice == 2) totalbill += 150 * quantity;
                else if (choice == 3) totalbill += 200 * quantity;
                else if (choice == 4) totalbill += 100 * quantity;
                else if (choice == 5) totalbill += 130 * quantity;
                else System.out.println("Invalid Choice!");
                break;
                
			case 2: 
				System.out.println("Main Course Menu: ");
				 System.out.println("1: Paneer Butter Masala - 250 Rs.");
                 System.out.println("2: Chicken Curry - 300 Rs.");
                 System.out.println("3: Veg Biryani - 180 Rs.");
                 System.out.println("4: Dal Tadka - 160 Rs.");
                 System.out.println("5: Butter Naan - 40 Rs.");
                 System.out.println("Select an item: ");
                 choice1=sc.nextInt();
                 System.out.println("Enter the quantity");
                 quantity=sc.nextInt();
                                  
                 if (choice == 1) totalbill += 250 * quantity;
                 else if (choice == 2) totalbill += 300 * quantity;
                 else if (choice == 3) totalbill += 180 * quantity;
                 else if (choice == 4) totalbill += 160 * quantity;
                 else if (choice == 5) totalbill += 40 * quantity;
                 else System.out.println("Invalid Choice!");
                 break;
                 
			case 3:
				System.out.println("Desert Menu");
				System.out.println("1. Ice Cream - 150 Rs.");
				System.out.println("2. Gulab Jamun - 50 Rs.");
				System.out.println("3. Chocolate cake - 100 Rs.");
				System.out.println("4. Brownie - 120 Rs.");
				System.out.println("Select an item: ");
                choice1=sc.nextInt();
                System.out.println("Enter the quantity");
                quantity=sc.nextInt();
                
                if (choice == 1) totalbill += 150 * quantity;
                else if (choice == 2) totalbill += 50 * quantity;
                else if (choice == 3) totalbill += 100 * quantity;
                else if (choice == 4) totalbill += 120 * quantity;               
                else System.out.println("Invalid Choice!");
                break;
                
			case 4: 
				System.out.println("Drinks Menu:");
                System.out.println("1: Coke - 50 Rs.");
                System.out.println("2: Lemonade - 60 Rs.");
                System.out.println("3: Coffee - 70 Rs.");
                System.out.println("4: Tea - 50 Rs.");
                System.out.print("Select an item: ");
                choice1 = sc.nextInt();
                System.out.print("Enter quantity: ");
                quantity = sc.nextInt();
                 
                 if (choice == 1) totalbill += 50 * quantity;
                 else if (choice == 2) totalbill += 60 * quantity;
                 else if (choice == 3) totalbill += 70 * quantity;
                 else if (choice == 4) totalbill += 50 * quantity;               
                 else System.out.println("Invalid Choice!");
                 break;
                 
            default:
            	System.out.println("Inavalid Category! Please enter a valid option");
			}
			System.out.println("\nDo you want to add another item? (Y/N): ");
			ans=sc.next();			
		} while (ans.equalsIgnoreCase("y"));
			
			System.out.println("Total Bill Amount: Rs. "+ totalbill);
			System.out.println("Thank you for ordering from My Hotel. Have A Great Day! :)");
			
			sc.close();
	}

}
