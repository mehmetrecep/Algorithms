package patternsAndStars.stars;

public class DiamondShape {
    public static void main(String[] args) {
        int n = 5;
        int i;
        for(i = 0; i <= n; i++){
            System.out.print(" ");
            for(int j = 0; j <= n; j++){
                if(j <= n - i - 1){
                    System.out.print(" ");
                }else System.out.print("* ");
            }

            System.out.println();
        }
        for (int k = 0 ; k < n; k++){
            System.out.print(" ");
            for (int t = n; t >= 0; t--){
                if (t <= n - k - 1 ){
                    System.out.print("* ");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
