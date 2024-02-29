import java.util.ArrayList;

public class RotatingLinkedLists {

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        
        ArrayList<Integer> arrayList = convertLinkedListToArray(head);
        
        int size = arrayList.size();
        k %= size; // Handle cases where k is larger than the size of the array list
        
        // Rotate the array list to the right by k places
        for (int i = 0; i < k; i++) {
            int lastElement = arrayList.remove(size - 1);
            arrayList.add(0, lastElement);
        }
        
        // Convert the rotated array list back to a linked list
        return convertArrayToLinkedList(arrayList);
    }
    
    // Helper method to convert linked list to array list
    private ArrayList<Integer> convertLinkedListToArray(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            arrayList.add(current.value);
            current = current.next;
        }
        return arrayList;
    }
    
    // Helper method to convert array list to linked list
    private ListNode convertArrayToLinkedList(ArrayList<Integer> arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int num : arrayList) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }
}

}
