public class Functions {
    public static void main(String[] args) {
        int sum = 0;
        int a=10;
        int b=20;
        sum = addNumbers(a,b);
        System.out.println("The sum of " + a + " and " + b + " is " + sum + ".");
    }
    static int addNumbers(int x,int y){
        return x + y;
    }
}
