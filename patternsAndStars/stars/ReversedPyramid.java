package patternsAndStars.stars;

public class ReversedPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i <= n; i++){
            for (int j = n; j >= 0; j--) {
                if(j <= n - i ){
                    System.out.printf("%-2c",'*');
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
