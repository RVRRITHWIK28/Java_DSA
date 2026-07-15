import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float PI = 3.14f;
        System.out.print("Enter the radius of the circle: ");
        int radius = sc.nextInt();
        float area = PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }
}
