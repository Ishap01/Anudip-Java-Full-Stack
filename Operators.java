package mypackage;
import java.util.Scanner;

public class Opearators {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\n Arithmetic Operators:");
        System.out.println("Addition (a + b) = " + (a + b));
        System.out.println("Subtraction (a - b) = " + (a - b));
        System.out.println("Multiplication (a * b) = " + (a * b));
        System.out.println("Division (a / b) = " + (a / b));
        System.out.println("Modulus (a % b) = " + (a % b));

        System.out.println("\n Relational Operators:");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        System.out.println("\n Logical Operators:");
        boolean condition1 = (a > 0);
        boolean condition2 = (b > 0);
        System.out.println("a > 0 && b > 0 : " + (condition1 && condition2));
        System.out.println("a > 0 || b > 0 : " + (condition1 || condition2));
        System.out.println("!(a > 0) : " + !(condition1));

        System.out.println("\n Bitwise Operators:");
        System.out.println("a & b : " + (a & b));
        System.out.println("a | b : " + (a | b));
        System.out.println("a ^ b : " + (a ^ b));
        System.out.println("~a : " + (~a));
        System.out.println("a << 1 : " + (a << 1));
        System.out.println("a >> 1 : " + (a >> 1));

        System.out.println("\n Assignment Operators:");
        int c = a; 
        System.out.println("c = a : " + c);
        c += b;
        System.out.println("c += b : " + c);
        c -= b;
        System.out.println("c -= b : " + c);
        c *= b;
        System.out.println("c *= b : " + c);
        c /= (b == 0 ? 1 : b); 
        System.out.println("c /= b : " + c);
        c %= (b == 0 ? 1 : b);
        System.out.println("c %= b : " + c);

        System.out.println("\n Unary Operators:");
        System.out.println("++a : " + (++a)); 
        System.out.println("--b : " + (--b)); 
        System.out.println("a++ : " + (a++)); 
        System.out.println("b-- : " + (b--)); 
        System.out.println("Final values of a: " + a + ", b: " + b);

        System.out.println("\n Ternary Operator:");
        int min = (a < b) ? a : b;
        System.out.println("Minimum value (a < b ? a : b) : "+1 min);

        sc.close();
    }
}
