public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
       ListNode result = new ListNode(0);
       ListNode ptr = result;

       int carry = 0; // set default carry is 0

       while(l1 != null || l2 != null){
        int sum = 0 + carry; //initialize sum

        if(l1 != null){ // use number from first list
            sum += l1.value;
            l1 = l1.next;
        }
        if(l2 != null){ // use number from second list
            sum += l2.value;
            l2 = l2.next;
        }

        carry = sum / 10;
        sum = sum % 10;
        ptr.next = new ListNode(sum);
        ptr = ptr.next;
       }

       if(carry == 1) ptr.next = new ListNode(1);

       return result.next;
    }
    
}
