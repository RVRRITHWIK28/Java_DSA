import java.util.Scanner;

public class Vote_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the eligibilty value : ");
        int n = sc.nextInt();
        eligibilityCriteria(n);
    }
    static int eligibilityCriteria(int n){
        if (n>=18){
            System.out.println("Eligible to vote.");
        }else{
            System.out.println("Not eligible to vote.");
        }
        return n;
    }
}
