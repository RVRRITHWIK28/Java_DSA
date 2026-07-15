import java.util.Scanner;

public class Inverted_Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            //spaces
            for (int j=0;j<=i-1;j++){
                System.out.print(" ");
            }
            //stars
            for (int k=0;k<n-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }   
}
