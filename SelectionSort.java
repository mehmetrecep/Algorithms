package DataStructureX.Algorthims;

public class SelectionSort {
    public static void main(String[] args) {
        int array[] = {10,3,4,6,8,2,1,9,7,5};

        int numbers[] = new int[array.length];
        selectionSort(array);
        /*for (int i: array) {
            System.out.printf("%d ",i);
        }*/

        for (int i = 0; i < array.length; i++) {
            numbers[i] = array[i];
        }
        for (int i: numbers) {
            System.out.printf("%d ",i);
        }
    }

    private static void selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
