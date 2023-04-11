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
        ListNode<Integer> numbers =
                new ListNode<>(2,
                        new ListNode<>(4,
                                new ListNode<>(3,null)));

        ListNode<Integer> n1 = new ListNode<>(3,null);
        ListNode<Integer> n2 = new ListNode<>(4,n1);
        ListNode<Integer> n3 = new ListNode<>(2,n2);

        System.out.printf("%d\n",numbers.getValue());
        System.out.printf("%d\n",numbers.getNext().getValue());
        System.out.printf("%d\n",numbers.getNext().getNext().getValue());

    }
}
