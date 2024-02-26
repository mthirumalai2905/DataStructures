
    public class DoubleListNode{
        int val;
        DoubleListNode prev;
        DoubleListNode next;

        public DoubleListNode(int val){
            this.val = val;
            prev = null;
            next = null;

        }
        public static void main(String[] args) {
            DoubleListNode l1 = new DoubleListNode(1);
            DoubleListNode l2 = new DoubleListNode(2);
            DoubleListNode l3 = new DoubleListNode(3);

            //link the nods
            l1.next = l2;
            l2.prev = l1;

            l2.next = l3;
            l3.prev = l2;

            //iterate from the beginning
            DoubleListNode temp = l1;
            while(temp != null){
                System.out.print(temp.val + ",");
                temp = temp.next;
            }
            System.out.println("");
            System.out.println("-----------------------");

            //iterate from the last
            temp = l3;
            while(temp != null){
                System.out.print(temp.val + ",");
                temp = temp.prev;
            }
    
        }
    }


