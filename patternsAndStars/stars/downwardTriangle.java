package patternsAndStars.stars;

public class downwardTriangle {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(j >= i){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
