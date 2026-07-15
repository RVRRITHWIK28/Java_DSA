import java.util.Scanner;

public class Hollow_Diamond_Full {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                if (k==1||k==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=1;i<=n-1;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            //Inner loop
            for (int k=1;k<=2*(n-i)-1;k++){
                if (k==1||k==2*(n-i)-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
