package patternsAndStars.stars;

public class LeftTrianglePascal {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
               if(j <= n - i ){
                   System.out.print(" ");
               }else System.out.print("&");
            }
            System.out.println();
        }
        for (int k = 0; k <= n; k++){
            for (int t = n; t >= 0; t--){
                if(t <= n - k){
                    System.out.print("&");
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
