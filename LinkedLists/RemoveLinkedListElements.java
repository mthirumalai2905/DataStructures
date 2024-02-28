public class RemoveLinkedListElements {
    public ListNode remove(ListNode head, int value){
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
 
        ListNode curr = dummy;
        while(curr.next != null){
             if(curr.next.value == value){
                 curr.next = curr.next.next;
             } else {
                 curr = curr.next;
             }
        }
 
        return dummy.next;
     }
     public static void main(String[] args) {
        RemoveLinkedListElements solution = new RemoveLinkedListElements();
        
        // Creating a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        
        int valueToRemove = 6;
        
        System.out.println("Original linked list:");
        printLinkedList(head);
        
        ListNode result = solution.remove(head, valueToRemove);
        
        System.out.println("Linked list after removing elements with value " + valueToRemove + ":");
        printLinkedList(result);
    }
    
    // Helper method to print the linked list
    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

}
