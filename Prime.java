import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        boolean result = Is_Prime(n);
        if (result){
            System.out.println(n + " is a Prime number.");
        }else{
            System.out.println(n + " is not a Prime number.");
        }
    }
    static boolean Is_Prime(int n){
        if (n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
