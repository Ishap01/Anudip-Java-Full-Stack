package mypackage;
import java.util.Scanner;

public class Interest_Cal {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("SIMPLE INTEREST CALCULATOR");
	        
	        System.out.print("Enter Principal Amount: ");
	        double principal = sc.nextDouble();
	        
	        System.out.print("Enter Rate of Interest (in %): ");
	        double interestRate = sc.nextDouble();
	        
	        System.out.print("Enter Number of Years: ");
	        double period = sc.nextDouble();
	        
	        double simpleInterest = (principal * interestRate * period) / 100;
	       
	        System.out.println("Simple Interest is: " + simpleInterest);

	        sc.close(); 
	    }
	}
