public class ListNode{
    public int value;
    public ListNode next;

    public ListNode(int x){
        this.value = x;
    }

    public static void display(){
        System.out.println("Hey its me linked lists");
    }

    public static void main(String[] args) {
        
        //creating nodes
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);

        //addressing them making the connections
        l1.next = l2;
        l2.next = l3;
        l3.next = null;

        display();
        //Initailizing a node for traversal
        ListNode ptr = l1;
        //printing the values
        while(ptr != null){
            System.out.print(ptr.value);
            if(ptr.next != null){
                System.out.print("-->");
            }
            ptr = ptr.next;
        }

        
    }


}