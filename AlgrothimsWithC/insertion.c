#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>



void insertionSort(int array[], int );
int main(int argc, char *argv[]){
    int array[14] = {90,12,11,1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
    size_t length = sizeof(array)/sizeof(*array);
    insertionSort(array, length);
    for(int i = 0; i < length; i++){
        printf("%d ", array[i]);
    }
    printf("\n");
    return 0;
}

void insertionSort(int array[], int length){
    for(int i = 1; i < length; i++){
        int temp = array[i];
        int j = i - 1;

        while(j >= 0 && array[j] > temp){
            array[j+1] = array[j];
            j--;
        }

        array[j+1] = temp;
    }
}

