#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>

void insertion(int array[], int size);
int main(int argc, char *argv[]){
    
    int array[20];
    for(int i = 0; i < 20; i++){
       array[i] = rand() % 100;
       
    }
   // size_t size = sizeof(array)/sizeof(*array);
    insertion(array, 20);
    for(int i = 0; i < 20; i++){
        printf("%d ", array[i]);
    }
    printf("\n");
    return 0;


}


void insertion(int array[], int size){
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
