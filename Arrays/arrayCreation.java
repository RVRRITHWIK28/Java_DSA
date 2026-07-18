package Arrays;

public class arrayCreation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        changeArrayValues(arr);
        for (int i=0;i<=9;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void changeArrayValues(int[] a){
        a[9] = 11;
    }
}
