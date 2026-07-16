import java.util.Scanner;

public class Swasthik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value: ");
        int n = sc.nextInt();

        int middle = n / 2 + 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i==middle || j==middle || (i==1 && j<=middle) || (j==n && i<=middle) || (i==n && j>=middle) || (j==1 && i>=middle)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}