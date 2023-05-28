package patternsAndStars.stars;

public class RightPascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int k = n; k > 0; k--){
            for (int t = 0; t < k; t++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
