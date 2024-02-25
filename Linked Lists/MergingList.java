public class MergingList {
    public static ListNode merging(ListNode head1, ListNode head2) {
        // CREATE A DUMMY NODE
        ListNode returnNode = new ListNode(Integer.MIN_VALUE);

        // CREATE A COPY OF THIS NODE TO ITERATE WHILE SOLVING THE PROBLEM
        ListNode headNode = returnNode;

        // TRAVERSAL TILL ONE OF THE LISTS REACHES THE END
        while (head1 != null && head2 != null) {
            if (head1.value <= head2.value) {
                returnNode.next = head1;
                head1 = head1.next;
            } else {
                returnNode.next = head2;
                head2 = head2.next;
            }
            returnNode = returnNode.next;
        }

        // APPEND THE REMAINING LIST
        if (head1 == null) {
            returnNode.next = head2;
        } else if (head2 == null) {
            returnNode.next = head1;
        }

        return headNode.next;
    }

    public static void main(String[] args) {
        // Example usage
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        ListNode mergedList = merging(list1, list2);

        // Print the merged list for demonstration
        while (mergedList != null) {
            System.out.print(mergedList.value + " ");
            mergedList = mergedList.next;
        }
    }
}
    