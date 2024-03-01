public class InsertionAndDeletion {

    //Insertion at the Beginning of the list
    public void insertAtBeginning(DoubleListNode node, int value){
        while(node.prev != null){
            node = node.prev;
        }

        DoubleListNode temp = new DoubleListNode(value);
        temp.next = node;
        node.prev = temp;
    }

    //Insertion at the End of the list
    public void insertAtEnd(DoubleListNode node, int value){
        while(node.next != null){
            node = node.next;
        }

        DoubleListNode temp = new DoubleListNode(value);
        temp.prev = node;
        node.next = temp;
    }

    //Insertion at the required position
    public void insertAtPosition(DoubleListNode node, int valueToInsert, int pos){
        //Go to the start
        while(node.prev != null){
            node = node.prev;
        }

        //move ahead required number of places
        for(int i=1; i < pos; i++){
            node = node.next;
        }

        DoubleListNode temp = new DoubleListNode(valueToInsert);
        temp.prev = node;
        temp.next = node.next;
        node.next.prev = temp;
        node.next = temp;
    }

    //Delete from the Beginning of the Linked Lists
    public void DeleteFromBeginning(DoubleListNode node){
        //Go to the start
        while(node.prev != null){
            node = node.prev;
        }

        DoubleListNode temp = node.next;
        node.next = null;
        temp.prev = null;
    }

    //Delete from the End
    public void deleteFromEnd(DoubleListNode node){
        //Go to the end
        while(node.next !=null){
            node = node.next;
        }

        DoubleListNode temp = node.prev;
        node.prev = null;
        temp.next = null;
    }


    //Delete from the random
    public void deleteAtPosition(DoubleListNode node, int pos){
        //Go to the start 
        while(node.prev != null){
            node = node.prev;
        }

        //Go to the position
        for(int i=0; i<pos; i++){
            node = node.next;
        }

        node.next.prev = node.prev;
        node.prev.next = node.next;
        node.next = null;
        node.prev = null;
    }

    public static void main(String[] args){

    }
    
}
