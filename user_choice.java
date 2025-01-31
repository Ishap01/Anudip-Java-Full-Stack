package mypackage;

import java.util.Scanner;

public class User_Choice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1: Check if a number is even or odd");
        System.out.println("2: Check if a character is a vowel or not");
        System.out.println("3: Check if a number is divisible by 5 or not");
        System.out.println("4: Find the greatest among three numbers");
        
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        
        switch (choice) {
        case 1:
        	System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
            	System.out.println(num + " is an Even number.");
            } else {
            	System.out.println(num + " is an Odd number.");
            }
            break;
        case 2:
        	System.out.print("Enter a character: ");
        	char ch=sc.next().toLowerCase().charAt(0);
        	
        	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        		System.out.println(ch+ " is a vowel!");
        	} else {
        		System.out.println(ch+ " is not a vowel!");
        	}
        	break;
        	
       case 3:
        	System.out.print("Enter a number: ");
			int num5=sc.nextInt();
			
			if (num5 % 5 == 0) {
				System.out.println(num5 + " is divisible by 5.");
			} else {
				System.out.println(num5 + " is not divisible by 5.");
			}
			break;
        case 4: 
        	System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            System.out.print("Enter third number: ");
            int c = sc.nextInt();
            
            int greatest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
            System.out.println(greatest+ " is the greatest number. ");
            break;
            
         default:
            	System.out.println("Invalid choice! Please enter a valid option.");
        }
        
        sc.close();			
        
        }

}


