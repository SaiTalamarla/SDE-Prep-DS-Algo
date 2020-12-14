public class LinkedListImpl implements LinkedList{

    ListNode head;
    private int length =0;
    LinkedListImpl(){
        length=0;
    }
    public ListNode getHead(){
        return head;
    }

    public int getLength() {
        return length;
    }

    public void clearList(){
        head=null;
        length=0;
    }
    @Override
    public void insertAtBegin(int data) {
        
    }

    
}