public class LinkedListIntersection {

    //Brute Force approach - using HashSet


    //Efficient Solution
    public static ListNode intersection(ListNode headA, ListNode headB){
        int lenA = getListLength(headA);
        int lenB = getListLength(headB);

        while (lenA > lenB) {
            lenA--;
            headA = headA.next;
        }

        while(lenB > lenA){
            lenB--;
            headB = headB.next;
        }

        //Now both heads are at same distance from intersection
        //Start moving them both untill they meet
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }

    private static int getListLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public static void main(String[] args){
        // Create linked list A: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);
        headA.next.next.next.next.next = new ListNode(6);

        // Create linked list B: 9 -> 8 -> 5 -> 6 -> null
        ListNode headB = new ListNode(9);
        headB.next = new ListNode(8);
        headB.next.next = headA.next.next.next.next; // Intersection point with list A

        ListNode intersectionNode = intersection(headA, headB);
        if (intersectionNode != null) {
            System.out.println("Intersection point value: " + intersectionNode.value);
        } else {
            System.out.println("No intersection point found.");
        }
    }
}
