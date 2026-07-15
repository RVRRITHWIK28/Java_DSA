import java.util.Scanner;

public class Hollow_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        //first row
        for (int i=1;i<=n;i++){
           System.out.print("*");
        }
        System.out.println();
        //middle row
        for (int i=1;i<=n-2;i++){
            //stars
            for (int j=1;j<=1;j++){
                System.out.print("*");
            }
            //spaces
            for (int k = 1;k<=n-2;k++){
                System.out.print(" ");
            }
            for (int l=n;l>=n;l--){
                System.out.print("*");
            }
            System.out.println();
        }
        //System.out.println();
        //end row
        for (int i=1;i<=n;i++){
           System.out.print("*");
        }
    }
}
