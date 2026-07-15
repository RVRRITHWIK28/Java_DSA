import java.util.Scanner;
public class Ass_1_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of the pencil : ");
        float pencil_cost = sc.nextFloat();
        System.out.print("Enter the cost of the pen : ");
        float pen_cost = sc.nextFloat();
        System.out.print("Enter the cost of the eraser : ");
        float eraser_cost = sc.nextFloat();
        float cost_with_tax = pencil_cost + pen_cost + eraser_cost + (pencil_cost + pen_cost + eraser_cost) * 0.18f;
        System.out.println("The total cost of the items including tax is : " + cost_with_tax);
        sc.close();
    }
}
