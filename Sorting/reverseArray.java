package Sorting;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverse_array(arr); //1,3,5,2,4
        for(Integer i:arr){
            System.out.print(i + " ");
        }
    }
    static void reverse_array(int[] arr){
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            int curr = arr[i];
            int last = arr[n-1-i];

            int temp = curr; //1
            curr = last; //4
            last = temp; //1
            
            arr[i] = curr;
            arr[n-1-i] = last;
        }
    }
}
