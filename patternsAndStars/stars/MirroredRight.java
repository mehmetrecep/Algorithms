package patternsAndStars.stars;
public class MirroredRight {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i <= n; i++){
//            System.out.print(" ");
            for (int j = n; j >= 0; j--){
                if(j > i){
                    System.out.print(" ");
                }else System.out.print("*");
            }
            System.out.println();
        }
    }
}
