import java.util.Scanner;

public class Even_Odd_Func {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        evenOdd(a);
    }
    static int evenOdd(int a){
        if (a%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
        return a;
    }
}
