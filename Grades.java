import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int n = sc.nextInt();
        boolean result = Pass_Fail(n);
        if(result){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
    static boolean Pass_Fail(int n){
        if(n>=40){
            if(n>=90 && n<=100){
                System.out.println("Grade : S");
            }else if(n>=80 && n<90){
                System.out.println("Grade : A");
            }else if(n>=70 && n<80){
                System.out.println("Grade : B");
            }else if(n>=60 && n<70){
                System.out.println("Grade : C");
            }else if(n>=50 && n<60){
                System.out.println("Grade : D");
            }else if(n>=40 && n<50){
                System.out.println("Grade : E");
            }
            return true;
        }else{
            return false;
        }
    }
}