package DataStructureX.Algorthims;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = new int[1000000];
        for(int i = 0 ; i < 1000000 ; i++){
            numbers[i] = i;
        }
        int target = 10;
        System.out.println(binarySearch(numbers,target));
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while(low <= high){
            int middle = low + (high -low) / 2;
            int value = array[middle];

            System.out.printf("Middle value: %d\n",value);

            if(value < target){
                low = middle +1;
            } else if (value > target) {
                high = middle - 1;
            }
            else {
                System.out.print("Found at index ");
                return middle;
            }
        }
        return -1;
    }
}
