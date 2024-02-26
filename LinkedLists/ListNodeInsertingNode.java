public class ListNodeInsertingNode {

    //INSERTING A NODE AT THE BEGINNING OF THE LINKED LIST
    public ListNode insertAtBeginning(ListNode head, int valueToInsert){
        //CREATING A NEW NODE
        ListNode newNode = new ListNode(valueToInsert);

        //ESTABLISH THE CONNECTION
        newNode.next = head;

        //REASSIGNING THE HEAD POINTER
        head = newNode;

        //RETURNING THE HEAD
        return head;
    }

    //INSERTING THE NODE AT THE END OF THE LINKEDLISTS
    public ListNode insertAtEnd(ListNode head, int valueToInsert){
    
        //CREATE A LISTNODE TO INSERT
        ListNode newNode = new ListNode(valueToInsert);

        //TRAVERSE TO THE END OF THE LIST
        ListNode ptr = head;
        while(ptr.next != null){
        ptr = ptr.next;
        }

        //ASSIGN THE NEWNODE TO THE TAIL OF THE LINKEDLISt
        ptr.next = newNode;

        //RETURNING THE HEAD
        return head;
    }


    //INSERTING AT A RANDOM POSITION IN THE LINKEDLIST
    public ListNode insertAt(ListNode head, int valToInsert, int position){

        //CREATE A LISTNODE TO INSERT
        ListNode newNode = new ListNode(valToInsert);

        ListNode ptr = head;
        //TRAVERSE TO THE LOCATION
        for(int i=0; i<position; i++){
            ptr = ptr.next;
        }

        //INSERT THE NODE
        newNode.next = ptr.next;
        ptr.next = newNode;

        //RETURN THE HEAD
        return head;
    }
}
