public class RemoveNthNodeLL {
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
    int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

     public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
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
        size++;
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void deleteNthFromEnd(int n) {
        // Calculate the length of the linked list
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // If n is equal to the length, remove the head node
        if (n == length) {
            head = head.next;
            return;
        }
        int i=1;
        int iToFind = size-n;
        Node prev = head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void main(String[] args) {
        RemoveNthNodeLL ll = new RemoveNthNodeLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        System.out.println("Original Linked List:");
        ll.print();

        int n = 2; // Remove the 2nd node from the end
        ll.deleteNthFromEnd(n);

        System.out.println("Linked List after removing " + n + "th node from the end:");
        ll.print();
    }
}