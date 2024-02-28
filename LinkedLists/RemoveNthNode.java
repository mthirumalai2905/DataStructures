public class RemoveNthNode {
    public static ListNode remove(ListNode head, int n){
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode firstPtr = dummy;
        ListNode secondPtr = dummy;

        //Move secondptr n spaces ahead
        for(int i =0; i<n;i++){
            secondPtr = secondPtr.next;
        }

        //Move both now, untill the next of secondPtr is null
        while(secondPtr.next != null){
            firstPtr = firstPtr.next;
            secondPtr = secondPtr.next;
        }

        //We now have to remove the node of next of firstptr
        firstPtr.next = firstPtr.next.next;

        return dummy.next;

    }
    
}
