import java.util.Scanner;

public class Largest_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        int c = sc.nextInt();
        if (a == b && b == c){
            System.out.println("All are equal");
        }
        else if (a >= b && a >= c){
            System.out.println("a is greater than b,c");
        }
        else if (b >= a && b >= c){
            System.out.println("b is greater than a,c");
        }
        else if (c >= a && c >= b){
            System.out.println("c is greater than a,b");
        }
    }
}
