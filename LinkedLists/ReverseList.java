// import java.util.Stack;

public class ReverseList {
    //Brue Force approach
    //using stack data structures due to its LIFO property and return it 
    // ListNode reverseWithStack(ListNode head){
    //     Stack<Integer> valueStack = new Stack<>();
    //     while(head != null){
    //         valueStack.push(head.value);
    //         head = head.next;
    //     }

    //     ListNode reversedList = new ListNode(Integer.MIN_VALUE);
    //     ListNode ptr = reversedList;

    //     while(!valueStack.isEmpty()){
    //         ptr.next = new ListNode(valueStack.pop());
    //         ptr = ptr.next;
    //     }

    //     return reversedList.next;

    //////////EFFICIENT SOLUTION////////////
    ListNode reverseWithoutExtraSpace(ListNode head){
        if(head == null){
            return null;
        }

        if(head.next == null){
            return head;
        }

        ListNode preNode = null;
        ListNode currNode = head;

        while(currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }

        head = preNode;

        return head;
    }
    public static void main(String[] args) {
        // Test your implementation
        ReverseList reverseList = new ReverseList();

        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        // Reverse the list
        head = reverseList.reverseWithoutExtraSpace(head);

        System.out.println("\nReversed List:");
        printList(head);
    }

    // Utility method to print the linked list
    private static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
    
}
