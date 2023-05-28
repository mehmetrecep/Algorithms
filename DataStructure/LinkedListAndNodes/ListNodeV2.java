package DataStructureX.Algorthims.DataStructure.LinkedListAndNodes;

public class ListNodeV2 {
    int val;
    ListNodeV2 next;
    ListNodeV2(){}
    ListNodeV2(int val){
        this.val = val;
    }
    ListNodeV2(int val, ListNodeV2 next){
        this.val = val;
        this.next = next;
    }

    public static void main(String[] args) {
        ListNodeV2 listNodeV21 = new ListNodeV2(2,
                                new ListNodeV2(4,
                                new ListNodeV2(3)));

        ListNodeV2 listNodeV22 = new ListNodeV2(5,
                new ListNodeV2(6,
                        new ListNodeV2(4)));

        ListNodeV2 v3 ;
        for(int i = 0; i < 3; i++){
//            if(listNodeV21 != null){
//                v3 = new ListNodeV2((listNodeV21.val+listNodeV22.val));
//                listNodeV21 = listNodeV21.next;
//                listNodeV22 = listNodeV22.next;
//            }

        }
        while (listNodeV21 != null){
            v3 = new ListNodeV2((listNodeV21.val+listNodeV22.val));
            listNodeV21 = listNodeV21.next;
        }

    }
}
