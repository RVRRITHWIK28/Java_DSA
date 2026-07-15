import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
       /*  for (int i=1;i<=n;i++){
            //spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        } */
        for (int i = 0; i < n; i++) {

            // Spaces: 0, 1, 2, 3, 4
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Stars: 9, 7, 5, 3, 1
            for (int k = 0; k < n - (2 * i); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}