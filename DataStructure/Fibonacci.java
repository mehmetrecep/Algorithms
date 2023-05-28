package DataStructureX.Algorthims.DataStructure;

public class Fibonacci {
    private static long[] fibonacciCache;
    public static void main(String[] args) {
        int num = 92;
        // 92 is the limit
        fibonacciCache = new long[num+1];
        System.out.printf("%d",fibonacci(num));
    }
    public static long fibonacci(int index){
        if(index<=1){
            return index;
        }
        if(fibonacciCache[index] != 0){
            return fibonacciCache[index];
        }
        long fibonacci = (fibonacci(index-1)+fibonacci(index-2));
        fibonacciCache[index] = fibonacci;
        return fibonacci;
    }
}
