public class RecursiveReversePrinting {
    void reversePrintUsingRecursion(ListNode head){
        //Terminating condition
        if(head.next == null){
            return;
        }

        //recursive call
        reversePrintUsingRecursion(head.next);

        //Actually Print the value
        System.out.println(head.value);
    }
    
}
