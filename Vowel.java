package mypackage;

import java.util.Scanner;

public class Vowel {	
	
		public static void main(String[] args) {
		
			Scanner sc =  new Scanner(System.in);
			System.out.print("Enter a character: ");
			char ch=sc.next().toLowerCase().charAt(0);
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch + " is a vowel!");
			} else {
				System.out.println(ch + " is not a vowel!");
			}
			
			sc.close();
		}
	}

