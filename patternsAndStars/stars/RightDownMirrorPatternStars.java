package patternsAndStars.stars;

public class RightDownMirrorPatternStars {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            for(int j = n; j >= 0; j--){
                if( j <= n - i - 1 ){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
