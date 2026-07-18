package Arrays;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter the target value : ");
        int k = sc.nextInt();
        int ind = b_Search(arr,k);
        System.out.println(ind);
    }
    static int b_Search(int[] arr,int k){
        int mid,low = 0,high=arr.length;    //high = 9
        while(low<=high){
            mid=(low+high)/2;               //mid = 4
            if(arr[mid] == k){
                return mid;
            }else if(arr[mid] < k){
                low = mid + 1;
            }else if(arr[mid] > k){
                high = mid - 1;
            }
        }
        return -1;
    }
}
