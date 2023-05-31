package patternsAndStars.stars;

public class RightDownMirrorPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i = n; i > 0; i--){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*for(int i = 0; i < n; i++){
            for(int j = n; j >= 0; j--){
                if( j <= n - i - 1 ){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }*/
    }
}
