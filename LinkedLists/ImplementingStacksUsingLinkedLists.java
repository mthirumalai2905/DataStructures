public class ImplementingStacksUsingLinkedLists {

    
    //push operation
    void push(int x, ListNode head){
        //Create a new node
        ListNode node = new ListNode(x);
        node.next = head;

        //move the head
        head = node;
    }

    //pop operation
    int pop(ListNode head){
        int number = head.value;

        //Actually pop
        head = head.next;

        return number;
    }

    //Checking the number
    int peek(ListNode head){
        return head.value;
    }

    //Checks whether its empty or not
    boolean isEmpty(ListNode head){
        return head == null;
    }

    public static void main(String[] args) {

        
    }
    
}
