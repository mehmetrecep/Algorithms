public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        
        int[] array = {8,9,7,2,3,1,5,4,6};
        SelectionSort(array);
        for(int i : array){
            System.out.println(i);
        }
        
    }

    public static void SelectionSort(int[] array){
            
        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = i + 1; j  < array.length; j++){
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
