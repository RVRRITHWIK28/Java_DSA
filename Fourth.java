import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        // This program calculates the sum of two numbers and prints the result.

        /*int a = 10, b = 20;
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum + ".");
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
    }
}
