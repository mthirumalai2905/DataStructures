
public class LinkedListMiddle {
    public static ListNode getMiddle(ListNode head){
      ListNode slow = head;
      ListNode fast = head;

      while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
      }

      return slow;
      
    }
    
}
