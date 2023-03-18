package DataStructureX.Algorthims;

public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {10,3,4,6,8,1,9,7,5};

        bubbleSort(array);
        for (int i: array) {
            System.out.printf("%d ",i);
        }
    }

    private static void bubbleSort(int[] array) {
        for(int i = 0 ; i < array.length -1; i++){
            for (int j = 0; j < array.length - i -1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
