package mypackage;

import java.util.Scanner;

public class Loop_demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        while (true) { 
            System.out.println("\n MENU: ");
            System.out.println("1. Display even numbers");
            System.out.println("2. Check if the number is a prime number");
            System.out.println("3. Check if the number is a palindrome");
            System.out.println("4. Check if the number is an Armstrong number");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter min: ");
                    int min = sc.nextInt();
                    
                    System.out.print("Enter max: ");
                    int max = sc.nextInt(); 

                    System.out.print("Even numbers between " + min + " and " + max + ": ");
                    for (int i = min; i <= max; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    boolean isPrime = true;
                    
                    for (int i = 2; i <= num / 2; i++) {
                            if (num % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }

                    if (isPrime) {
                        System.out.println(num + " is a Prime Number!");
                    } else {
                        System.out.println(num + " is not a Prime Number.");
                    }
                    break;

                case 3:
                	int Num, r, rev = 0;
                    System.out.print("Enter number: ");
                    Num = sc.nextInt();
                    int OriginalNum = Num;
                    
                    while(Num>0) 
                    {
                    	r = Num % 10;
                    	rev = rev*10 + r;
                    	Num =  Num / 10;
                    }
                    
                    if (OriginalNum == rev) {
                    	System.out.println(OriginalNum + " is a palindrome.");
                    } else {
                    	System.out.println(OriginalNum + "is not a palidrom.");
                    }                   
                    break;

                case 4:
                    System.out.print("Enter a number: ");
                    int Num1=sc.nextInt();
                    int r1, sum=0;
                    int Num2 = Num1;
                    
                    while (Num1>0) {
                    	r1 = Num1 % 10;
                    	sum = sum + r1*r1*r1;
                    	Num1 = Num1/10;
                    }
                    if (Num2 == sum) {
                    	System.out.println("It is an Armstrong Number.");
                    } else {
                    	System.out.println("It is not an Armstrong Number.");
                    } 
                    break;
                    
                case 5:
                    System.out.println("Exiting program. Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}
