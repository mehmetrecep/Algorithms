package DataStructureX.Algorthims;


public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {10,3,4,6,8,2,1,9,7,5};

        insertionSort(array);
        for (int i: array) {
            System.out.printf("%d ",i);
        }
    }

    private static void insertionSort(int[] array) {

        for(int i = 1; i < array.length; i++ ){
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[i+1] = temp;
        }
    }
}
