package mypackage;
import java.util.Scanner;

public class Circle {
	
		public static void main(String[] args) {
			
			  Scanner sc =new Scanner(System.in);
	          System.out.println("Area and Perimeter of Circle");
	          System.out.println("Enter Radius of Circle: ");
	          float radius = sc.nextFloat();
	          float area =  3.14f * radius*radius;
	          double perimeter = 2 * 3.14 * radius ;
	          System.out.println("Area of Circle is " + area);
	          System.out.println("Perimeter of Circle is " + perimeter);
		}

	}
