package mypackage;
import java.util.Scanner;

public class Personal_Titles {

	public static void main(String[] args) 
	{
		double age;
		String gender;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		age=sc.nextDouble();
		System.out.print("Enter your gender: ");
		gender=sc.next().trim();
		
		if (gender.equalsIgnoreCase("m")) {
            if (age >= 16) {
                System.out.println("Mr.");
            } else {
                System.out.println("Master");
            }
        } else if (gender.equalsIgnoreCase("f")) {
            if (age >= 16) {
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }
        } else {
            System.out.println("Invalid Input!");
        }
	}

}

