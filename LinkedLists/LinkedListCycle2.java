public class LinkedListCycle2 {
    public static ListNode circularNode(ListNode head){
         
        //Start both from head
        ListNode slow = head;
        ListNode fast = head;

        //Advance both at different speeds
        // until they meet once
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            //As soon as they meet, start from the head
            //again and move at the same speed
            if(slow == fast){
                while(head != slow){
                    head = head.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }  
    
}
