package Arrays;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {5,3,2,6,7,8,9,4,7};
        int target = 2;
        l_Search(arr,target);
    }
    static void l_Search(int[] arr,int target) {
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                System.out.println("2 Element is found at " + i + " position.");
                break;
            }
        }
    }
}
