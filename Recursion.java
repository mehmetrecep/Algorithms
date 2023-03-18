package DataStructureX.Algorthims;

public class Recursion {
    static int rev = 0;
    public static void reverse(int n){
        if(n <= 0){
            return;
        }
        int rem = n % 10;
        rev = rev * 10 + rem;
        reverse(n/10);
    }
    public static void main(String[] args) {
        int n = 109;
        reverse(n);
        System.out.printf("%d",rev);
    }

}
