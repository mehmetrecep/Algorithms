#include <stdio.h>
#include <stdlib.h>
#include <sys/_types/_null.h>

struct digit{
    int num;
    struct digit* next;
};
struct digit* creatDigit(int);
struct digit* append(struct digit* end, struct digit* newDigptr);
void printNumber(struct digit* );
void freeNumber(struct digit* star);
struct digit* readNumber();
struct digit* searchNumber(struct digit* start, int num);
int main(int argc, char* argv[]){
   struct digit* start, *ptr, *backword;
   int searchNum = 5;
   printf("Please enter a number : ");
   start = readNumber();
    printNumber(start);
     // ptr = searchNumber(start, searchNum);
    /*if(ptr != NULL){
        printf("Found digit %d at location %p", searchNum, ptr);
    }else {
        printf("%d not found", searchNum);
    }*/
    backword = reverseOrder(start);
    printNumber(backword);
    freeNumber(start);
    return 0;

}

struct digit* creatDigit(int dig){
    struct digit* ptr;
    ptr = (struct digit*)malloc(sizeof(struct digit));
    ptr->num = dig;
    ptr->next = NULL;

    return 0;
}

struct digit* append(struct digit* end, struct digit* newDigptr){
    end->next = newDigptr;
    return(end->next);
}
void printNumber(struct digit* start){
    struct digit* ptr = start;
    while(ptr != NULL){
        printf("%d", ptr->num);
        ptr = ptr->next;
    }
    printf("\n");
}

void freeNumber(struct digit* start){
    struct digit* ptr = start;
    struct digit* tmp;
    while(ptr != NULL){
        tmp = ptr->next;
        free(ptr);
        ptr = tmp;
    }

}
struct digit* readNumber(){
    char c;
    int d;
    struct digit* start, *end, *newptr;
    start = NULL;
    scanf("%c", &c);
    while(c != '\n'){
        d = c - 48;
        newptr = creatDigit(d);
        if(start == NULL){
            start = newptr;
            end = start;
        }else{
            end = append(end,newptr);
        }
        scanf("%c", &c);
    }
    return start;
}
struct digit* searchNumber(struct digit* start, int num){
    struct digit* ptr = start;
    while(ptr != NULL && ptr->num != num){
        ptr = ptr->next;
    }
    return(ptr);
}

