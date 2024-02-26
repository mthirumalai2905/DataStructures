import java.util.HashSet;

public class RemoveDuplicates {
    //Brute Force using set
    public ListNode removeDups(ListNode head){
    
    HashSet<Integer> set = new HashSet<>();

    ListNode temp = head;
    ListNode prev = null;
    while(temp != null){
        if(set.contains(temp.value)){
            prev.next = temp.next;
        } else {
            set.add(temp.value);
            prev = temp;
        }
        temp = temp.next;
    }

    return head;
    }
    public static void main(String[] args) {
        RemoveDuplicates remover = new RemoveDuplicates();

        // Creating a sample linked list with duplicates
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(2);

        System.out.println("Original List:");
        printList(head);

        // Removing duplicates from the list
        head = remover.removeDups(head);

        System.out.println("\nList after removing duplicates:");
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


    //Effiecient solution
    ListNode removeDuplicates(ListNode head){
        ListNode prev = head;
        ListNode temp = prev.next;

        while(temp != null){
            if(temp.value == prev.value){
                temp = temp.next;
                continue;
            }

            prev.next = temp;
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return head;

    }
    
}
