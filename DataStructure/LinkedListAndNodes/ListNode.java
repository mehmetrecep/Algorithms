package DataStructureX.Algorthims.DataStructure.LinkedListAndNodes;

public class ListNode {
    private int value;
    private ListNode next;

    public ListNode(int value, ListNode next){
        this.next = next;
        this.value = value;
    }
    public ListNode(int value){
        this.value = value;
        this.next = null;
    }
    public ListNode(){}

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
