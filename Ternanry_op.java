import java.util.Scanner;

public class Ternanry_op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        int c = sc.nextInt();
        String largest = "";
        largest = (a == b && a == c) ? "All equal" : (a >= b && a >= c) ? "a is greater" : (b >= a && b >= c) ? "b is greater" : (c >= a && c >= b) ? "c is greater" : "";
        System.out.println(largest);
    }
}
