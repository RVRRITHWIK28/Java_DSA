import java.util.Scanner;

public class Butterfly {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1;i<=2*n;i++){
            System.out.print("*");
        }
        System.out.println();
        for (int j=1;j<=n;j++){
            for (int k=1;k<=n-j;k++){
                System.out.print("*");
            }
            for(int l=1;l<=2*j;l++){
                System.out.print(" ");
            }
            for (int k=1;k<=n-j;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
