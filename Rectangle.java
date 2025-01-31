package mypackage;
import java.util.Scanner;

public class Rectangle {
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Area and Perimeter of rectangle");
			
			System.out.println("Enter Length of Rectangle");
			float l = sc.nextInt();
			
			System.out.println("Enter Breadth of Rectangle");
			float b = sc.nextInt();
			
			float area = l * b;
			float perimeter = 2 * (l + b);
			
			System.out.println("Area of rectangle:" + area); 
			System.out.println("Perimeter of Rectangle:" + perimeter);
			
		}

	}
