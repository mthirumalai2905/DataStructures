import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class SortingLL {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the linked lists
        linkedList.add(10);
        linkedList.add(5);
        linkedList.add(15);
        linkedList.add(0);

        // Convert linked list to ArrayList and sort
        ArrayList<Integer> arrayList = new ArrayList<>(linkedList);
        Collections.sort(arrayList);

        // Reconstruct the linked list from the sorted ArrayList
        linkedList = new LinkedList<>(arrayList);

        // Print the sorted linked list
        System.out.println("Sorted Linked List:");
        for (Integer num : linkedList) {
            System.out.print(num + " ");
        }
    }
}
