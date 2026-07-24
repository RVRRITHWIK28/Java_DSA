package Sorting;

import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements : ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt(); //20,10,12,15,2 
        }
        selection_sort(arr);
        for (Integer i:arr){
            System.out.print(i + " ");
        }
        sc.close();
    }
    static void selection_sort(int[] arr){
        int k = arr.length;
        for(int i=0;i<k;i++){ // 5 elements
            int minIndex = i; //minIndex = 20
            for(int j=i;j<k;j++){ 
                if(arr[j]<arr[minIndex]){ //arr[0] --- 20 < 20 ? false....nextstep ----> arr[1] --- 10 < 20 ? true..
                    minIndex = j; // minIndex = 1...nextstep ---> arr[2] ---> 12 < 10 ? true...minIndex = 2
                                  // arr[3] --> 15 < 10..false...nextstep arr[4] ---> 10 < 2 ? true...minIndex = 4
                } // Finally, minIndex = 4
            }
            int temp = arr[i]; //temp = arr[0] ---> 20
            arr[i] = arr[minIndex]; //arr[0] = arr[4] ---> arr[0] = 2
            arr[minIndex] = temp; // arr[4] = 20...same thing happens for entire loops to get asc order.
        }
    }
}
