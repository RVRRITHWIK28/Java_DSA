package Sorting;

import java.util.Scanner;

public class pairsArray {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the sum(pairs) element : ");
        int k = sc.nextInt();
        pairs_array(arr,k); //5,2,3,4,1,6,7
    }
    static void pairs_array(int[] arr,int k){
        int n = arr.length;
        int count = 0;
        System.out.println("Pairs are : ");
        for(int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i]+arr[j] == k){
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                    count += 1;
                }
            }
        }
        System.out.println("The number of pairs are : " + count);
    }
}
