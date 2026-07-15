import java.util.Scanner;

public class Diff_Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of lines : ");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            //spaces
            for (int j=0;j<i;j++){
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
