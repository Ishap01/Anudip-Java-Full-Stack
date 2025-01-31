package mypackage;
import java.util.Scanner;

public class Employee_details {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Employee Name:");
	        String name = sc.nextLine();

	        System.out.print("Enter Employee Age:");
	        int age = sc.nextInt();
	        sc.nextLine();
	        
	        System.out.print("Enter Employee Salary:");
	        double salary = sc.nextDouble();
	        sc.nextLine();
	       
	        System.out.print("Enter Employee Gender:");
	        String gender = sc.nextLine();
	        

	        System.out.print("Enter Employee Address:");
	        String address = sc.nextLine();


	        System.out.println("\nEmployee Details :-");
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Salary: " + salary);
	        System.out.println("Gender: " + gender);
	        System.out.println("Address: " + address);

	        sc.close();
	    }
	}
