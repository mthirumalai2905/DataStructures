public class LinkedListCycle {
    //Brute Force approach
    //Solving it using HashSet

    //Efficient Solution via Floyd Warshall's Algorithm
    public static boolean hasCycle(ListNode head){
        if(head == null || head.next == null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            if(slow == fast){
                return true;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return false;

    }
    public static void main(String[] args) {
        // Creating linked list with a cycle for testing
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = head.next; // Create a cycle

        boolean hasCycle = hasCycle(head);
        System.out.println("Does the linked list have a cycle? " + hasCycle);
    }
}
