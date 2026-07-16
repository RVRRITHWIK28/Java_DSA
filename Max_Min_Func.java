import java.util.Scanner;

public class Max_Min_Func {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        int max = giveMaximum(a,b);
        System.out.println("The maximum between " + a + " and " + b + " is " + max + ".");
    }
    static int giveMaximum(int a,int b){
        if (a>b){
            return a;
        }else{
            return b;
        }
    }
}
