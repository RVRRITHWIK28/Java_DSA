package Sorting;

import java.util.Scanner;

public class subArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements : ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt(); //1,2,3,4,5 
        }
        sub_array(arr);
    }
static void sub_array(int[] arr) {
    int n = arr.length;
    int count = 0;
    System.out.println("Sub Arrays are:");
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            System.out.print("{");
            for(int k=i;k<=j;k++){
                System.out.print(arr[k]);
                if(k<j){
                    System.out.print(",");
                }
            }
            count += 1;
            System.out.print("}");
            System.out.println();
        }
        System.out.println();
    }
    System.out.println("The possible Sub Arrays are: " + count);
}
}
