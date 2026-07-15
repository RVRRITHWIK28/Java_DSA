import java.util.Scanner;

public class Hollow_Inverted_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();
        //First row
        for (int i=1;i<=2*n-1;i++){
            System.out.print("*");
        }
        System.out.println();
        //spaces
        for (int j=1;j<=n-1;j++){
            for (int k=1;k<=j;k++){
                System.out.print(" ");
            }
            for (int l=1;l<=2*(n-j)-1;l++){
                if (l==1||l==2*(n-j)-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
