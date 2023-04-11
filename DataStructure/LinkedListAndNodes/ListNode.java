package DataStructureX.Algorthims.DataStructure.LinkedListAndNodes;

public class ListNode <E> {
    private E value;
    private ListNode <E> next;


    public ListNode(E value, ListNode<E> next){
        this.next = next;
        this.value = value;
    }
    public ListNode(E value){
        this.value = value;
        this.next = null;
    }
    public ListNode(){}

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode<E> next) {
        this.next = next;
    }

    public static void main(String[] args) {

    }
}
