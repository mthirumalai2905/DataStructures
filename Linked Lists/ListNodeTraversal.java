public class ListNodeTraversal {
   
  public void traversal(ListNode head){
    ListNode temp = head;

    while(temp != null){
        System.out.println(temp.value);
        if(temp.next != null){
            System.out.print("-->");
        }
        temp = temp.next;
    }
  }
    
}
