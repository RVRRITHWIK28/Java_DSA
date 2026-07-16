import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of radius : ");
        int r = sc.nextInt();
        double circumference = Circumference(r);
        double area = Area(r);
        System.out.println("The circumference of ciricle is : " + circumference);
        System.out.println("The area of circle is : " + area);
    }
    static double Circumference(int a){
        return 2*3.14*a;
    }
    static double Area(int b){
        return 3.14*b*b;
    }
}
