import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        long result = Is_Factorial(n);
        System.out.println("The factorial of " + n + " is " + result + ".");
    }
    static long Is_Factorial(int n) {
        long factorial = 1;
        for (int i=1;i<=n;i++){
            factorial = factorial*i;
        }
        return factorial;
    }
}
