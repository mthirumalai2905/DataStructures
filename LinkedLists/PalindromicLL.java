public class PalindromicLL {
    boolean isPalindrome(ListNode head) {
        // Find the middle
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Reverse the second half
        slow = reverseList(slow);
        fast = head;

        // Start comparing one by one
        while (slow != null) {
            if (fast.value != slow.value) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        ListNode currNode = head;

        while (currNode != null) {
            ListNode nextNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = nextNode;
        }

        head = preNode;
        return head;
    }

    public static void main(String[] args) {
        PalindromicLL solution = new PalindromicLL();

        // Creating a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        boolean isPalindrome = solution.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + isPalindrome);
    }
}

class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}
