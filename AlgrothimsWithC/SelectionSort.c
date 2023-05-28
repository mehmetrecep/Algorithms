#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>


void SelectionSort(int[], size_t);

int main(int argc, char *argv[])
{
    int array[] = {8,9,7,2,3,1,5,4,6};
    size_t lengthOfArray = sizeof(array) / sizeof(*array);

    SelectionSort(array, lengthOfArray);
    
     for(int i = 0; i < lengthOfArray; i++){
        printf("%d\n",array[i]);
    }

    
    return 0 ;
}

void SelectionSort(int array[],size_t lengthOfArray){
 

    for(int i = 0; i < lengthOfArray - 1; i++){
        int min = i;
        for(int j = i + 1; j < lengthOfArray; j++){
            if(array[min] > array[j]){
                min = j;
            }
        }
        int temp = array[i];
        array[i] = array[min];
        array[min] = temp;
    }

}
