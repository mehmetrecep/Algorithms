package DataStructureX.Algorthims.DataStructure;

public class DynamicArrayV2 {
    /*Dynamic array is the same as ArrayList, but it made
     by the developer*/
    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArrayV2(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
    }

    public DynamicArrayV2() {
        this.array = new Object[capacity];
    }

    private void grow(){
        /*
            We use this method if we want to make the array bigger
         */
        int NEW_CAPACITY = (int)(capacity * 2);
        Object[] newArrayV2 = new Object[NEW_CAPACITY];

        for (int i = 0; i < size; i++){
            newArrayV2[i] = array[i];
        }
        array = newArrayV2;
        capacity = NEW_CAPACITY;
    }

    private void addingObj(Object obj){
        /*
            - We make sure that there's space in the array if it's not use
               grow() method.
         */
        if(size >= capacity){
            grow();
        }
        /* Here we're adding the element into the array
            then extend the size + 1*/
        array[size] = obj;
        size++;
    }
    private void insertingObj(int index, Object obj){
        /*
            - We make sure that there's space in the array if it's not use
               grow() method.
         */
        if(size >= capacity){
            grow();
        }
        /*
            - If we made the value of i = 0 , i < index and i++
                 ** for(int i = 0; i < index; i++){
                    array[i] = array[i+1];
                    }*
                ,we'll lose one element from the array, and you can try it :)
         */
        for(int i  = size; i > index; i--){
            // we used i+j+1 to shift the array to the right
            array[i] = array[i-1];
        }
        array[index] = obj;
        size++;
    }
    public int search(Object data){
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(data)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        /*
            This method coped from Bro Code channel you can take a look
              if you want :)
              also you can the inherited one from Array or override new one.
         */
        String string = "";

        for (int i = 0; i < size; i++){
            string += array[i] + ",";
        }
        if(string != ""){
            string = "{"+string.substring(0, string.length()-1)+"}";
        }else string = "{}";

        return string;
    }
    private void deletingObj(Object obj){
        for(int i = 0; i < size; i++){
            /*
                I used .equals() method in case you're going to search for Object
                    because if used == it's going to compare the reference not
                    the value therefor we're using .equals() method.

             */
            if(array[i].equals(obj)){
               /* we don't want to search until the size until the index of object
                 we want to delete */
                for(int j = 0; j < size - i -1; j++){
                    // we used i+j+1 to shift the array to the left
                    array[i+j] = array[i+j+1];
                }
            }
            array[size-1] = null;
            size--;
            /* You 'll ask why we used 3 because the growth
                factor of arraylist in java is 1.5 ,so we make it double*/
            if(size <= (int) (capacity /3)){
                shrink();
            }
            // We used break because we want it to implement(delete) just one object
            break;
        }
    }

    private void shrink() {
        /* You 'll ask why we used 3 because the growth
           factor of arraylist in java is 1.5 ,so we make it double*/
        int NEW_CAPACITY = (int)(capacity / 3);
        // We created new array to store the value of old array at.
        Object[] newArrayV2 = new Object[NEW_CAPACITY];

        for (int i = 0; i < size; i++){
            newArrayV2[i] = array[i];
        }
        // Then we made the old array equal to the new one.
        array = newArrayV2;
        capacity = NEW_CAPACITY;
    }

    public static void main(String[] args) {
        DynamicArrayV2 dynamicArrayV2 = new DynamicArrayV2();
        dynamicArrayV2.addingObj("1");
        dynamicArrayV2.addingObj("2");
        dynamicArrayV2.addingObj("3");
        dynamicArrayV2.insertingObj(1,"4");
        dynamicArrayV2.deletingObj(2);
        System.out.println(dynamicArrayV2.toString());
    }
}
