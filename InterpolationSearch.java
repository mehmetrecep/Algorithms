package DataStructureX.Algorthims;

public class InterpolationSearch {
 public static void main(String[] args) {
   /*
    The Interpolation search is improvement over binary search best used for uniformly distributed data
    */
   int[] numbers = new int[1000000];
   for (int i = 0; i < numbers.length; i++) {
     numbers[i] = i;
   }
   int index = interpolationSearch(numbers, 393);

   if(index != -1){
       System.out.printf("Element found at index %d\n",index);
   }else System.out.printf("Element not found\n");

 }

 private static int interpolationSearch(int[] numbers, int value) {
    int high = numbers.length - 1;
    int low = 0;

    while(value >= numbers[low] && value <= numbers[high] && low <= high){

        int probe = low + (high - low) * (value - numbers[low]) /
                            (numbers[high] - numbers[low]);
        System.out.printf("Guess is : %d\n",probe);
        if (numbers[probe] == value){
            return probe;
        } else if (numbers[probe] < value) {
            low = probe + 1;
        }else{
            high = probe - 1;
        }
    }

    return -1;
 }

}
