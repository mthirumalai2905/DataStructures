public class oddEvenList {
    public ListNode oddEven(ListNode head){
        if(head == null){
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;

        //Maintain the even head
        ListNode evenHead = even;

        while(even != null && even.next != null){
            //Change pointers for odd list
            odd.next = odd.next.next;
            odd = odd.next;

            //Change pointers for even list
             even.next = even.next.next;
             even = even.next;
        }

        //assign the even list at the end of he odd list
        odd.next = evenHead;

        return head;
    }
    
}
