import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter table number n : ");
        int n = sc.nextInt();
        System.out.print("Enter value number k : ");
        int k = sc.nextInt();
        for (int i = 1; i <= k; i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
        sc.close();
    }
}
