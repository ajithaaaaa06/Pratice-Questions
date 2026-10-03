public class ReverseLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

     public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }


    public static void main(String args[]) {
        ReverseLL ll = new ReverseLL();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(1,9);

        ll.print();

        ll.reverse();

        ll.print();
    }
}