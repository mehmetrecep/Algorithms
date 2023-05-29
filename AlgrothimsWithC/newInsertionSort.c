#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>

void insertion(int array[], size_t size);
int main(int argc, char *argv[]){

    int array[] = {100,0,90,12,5, 2, 4, 6, 1, 3};
    size_t size = sizeof(array)/sizeof(*array);
    insertion(array, size);
    for(int i = 0; i < size; i++){
        printf("%d ", array[i]);
    }
    printf("\n");
    return 0;

}


void insertion(int array[], size_t size){
    for(int i = 1; i < size; i++){
        int temp =  array[i];
        int j = i - 1;

    while(j >= 0 && array[j] > temp){
        array[j + 1] = array[j];
        j--;
    }
    array[j + 1] = temp;
    }
}
