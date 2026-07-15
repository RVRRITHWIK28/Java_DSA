import java.util.Scanner;

public class Hollow_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        for (int i=1;i<=n-1;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for (int l=1;l<=2*i-1;l++){
                    if (l==1||l==2*i-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }
        for(int k=1;k<=2*n-1;k++){
            System.out.print("*");
        }
    }
}