public class ListNodeDeletion {
    //DELETING FROM THE HEAD POSITION
    public ListNode deleteFromBeginning(ListNode head){

        //JUST MOVE THE HEAD TO THE NEXT POSITION
        head = head.next;

        //RETURN THE HEAD
        return head;
    }
    //DELETING FROM THE TAIL POSITION
    public ListNode deleteFromTheEnd(ListNode head){
        //MOVE TO THE SECOND LAST NODE
        ListNode ptr = head;
        while(ptr.next.next != null){
            ptr = ptr.next;
        }

        //POINT THE SECOND LAST NODE TO THE NULL
        ptr.next = null;

        //RETURN THE HEAD
        return head;
    }
    //DELETING FROM THE RANDOM POSITION
    public ListNode deleteFromRandom(ListNode head, int position){
        //MOVE TO THE PREVIOUS POSITION OF NODE TO DELETE
        ListNode ptr = head;
        for(int i = 0; i < position - 1; i++){
            ptr = ptr.next;
        }

        //GET THE NODE TO DELETE
        ListNode nodeToDelete = ptr.next;

        //GET THE ADDRESS OF NODE NEXT TO THE NODE TO BE DELETED
        ListNode nextNode = nodeToDelete.next;

        //POINT THE NEXT OF PTR TO NEXTNODE
        ptr.next = nextNode;

        //RETURN HEAD
        return head;


    }
}
