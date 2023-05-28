package DataStructureX.Algorthims.DataStructure.LinkedListAndNodes;

public class ListNode <E> {
    static int rev = 0;
    static int rev2 = 0;
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

        ListNode<Integer> numbers2 =
                new ListNode<>(5,
                        new ListNode<>(6,
                                new ListNode<>(4,null)));

        ListNode<Integer> n1 = new ListNode<>(3,null);
        ListNode<Integer> n2 = new ListNode<>(4,n1);
        ListNode<Integer> n3 = new ListNode<>(2,n2);

//        System.out.printf("%d\n",numbers.getValue());
//        System.out.printf("%d\n",numbers.getNext().getValue());
//        System.out.printf("%d\n",numbers.getNext().getNext().getValue());

//        while(numbers != null){
//            System.out.println(numbers.getValue());
//            numbers = numbers.getNext();
//        }

        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();

        while(numbers != null){
            stringBuffer.append(numbers.getValue());
            numbers = numbers.getNext();
        }
        while(numbers2 != null){
            stringBuffer2.append(numbers2.getValue());
            numbers2 = numbers2.getNext();
        }

        System.out.println(stringBuffer);
        String string = stringBuffer.toString();
        String string2 = stringBuffer2.toString();
        int num = Integer.parseInt(string);
        int num2 = Integer.parseInt(string2);
        reverse(num);
        reverse1(num2);
        System.out.println(rev);
        System.out.println(rev+rev2);



    }
    public static void reverse(int n){
        if(n <= 0){
            return;
        }
        int rem = n % 10;
        rev = rev * 10 + rem;
        reverse(n/10);
    }
    public static void reverse1(int n){
        if(n <= 0){
            return;
        }
        int rem = n % 10;
        rev2 = rev2 * 10 + rem;
        reverse1(n/10);
    }
}
