package Sorting;

import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();
    int[] arr = new int[n]; //5,4,3,2,1
    System.out.println("Enter array elements:");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        } // ArrayCreation Done
    bubble_sort(arr);
    System.out.println("Sorted Array:");
        for (Integer i:arr){
            System.out.print(i + " ");
        }
    }
    static void bubble_sort(int[] arr){
        int n = arr.length;
        for(int turns=0;turns<n;turns++){

            for(int i=0;i<n-1-turns;i++){
                int curr = arr[i];
                int next = arr[i+1];
                if(curr>next){
                    swap(i,arr);
                }
            }
        }
    }
    static void swap(int i,int[] arr){
        int temp = arr[i]; //temp = 5
        arr[i] = arr[i+1]; //arr[0] = 4
        arr[i+1] = temp; //arr[1] = 5
    }
}
