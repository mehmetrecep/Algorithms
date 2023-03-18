package DataStructureX.Algorthims;

public class LinearSearch {
    public static void main(String[] args) {
        /* - runtime complexity : 0(n)
           - Disadvantages:
                1. Slow for large data sets
           - Advantages:
                1. Fast for searches of small and medium data sets
                2. Doesn't need to br sorted
                3. Useful for data structures that don't have random access
        */
        int[] array = {1,3,4,6,50,7};
        int index = linearSearchMethod(array,50);

        if(index != -1){
            System.out.printf("Element found at index %d \n",index);
        }else System.out.printf("Element not found");
    }
    private static int linearSearchMethod(int[] array, int value){
        for(int i = 0; i < array.length; i++){
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }
}
