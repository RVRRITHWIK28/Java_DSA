import java.util.Scanner;

public class SandGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        //First line
        for (int i=1;i<=2*n-1;i++){
            System.out.print("*");
        }
        System.out.println();
        //Middle line
        for (int j=1;j<=n-2;j++){
            for (int k=1;k<=j;k++){
                System.out.print(" ");
            }
            for (int l=1;l<=2*(n-j)-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower line
        for (int i=1;i<=n-1;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Bottom line
        for (int i=0;i<=2*n-1;i++){
            System.out.print("*");
        }
    }
}
