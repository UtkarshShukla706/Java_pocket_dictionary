
// Linked List implementation in java for the removing operation mainly
public class LinkedList2 {
   
    // here we are going to perform the adding operations in the Linked List
    // we can also use the collection framework of the java for the linked list
    // application but
    // for the understanding of the concepts we need to perform teh full operations

    // making the node class for the linked list
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // empty function for the linked list

    public static boolean isEmpty() {
        return head == null;
    }

    // adding the element at the first position of the linked list

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // for adding the element at the last part of the Linked list

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }


    // adding the element at between the index
    public void addBetween(int index,int data){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

    // for printing the Linked List

    public static void print() {
        if (isEmpty()) {
            System.out.println("the linked list is empty and do not contain any element");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("null");
    }


    // removing the first element from the linked list

    public int removeFirst(){
        if(isEmpty()){
            System.out.println("the linked list is empty");
            return -1;
        }

        int val=head.data;
        if(head==tail){
            head=tail=null;
            return val;
        }
        head=head.next;
        return val;
    }


    // removing the last element form the Linked list

    public int removeLast(){
        if(isEmpty()){
            System.out.println("the linked list is empty");
            return -1;
        }

        int val=tail.data;
        if(head==tail){
            head=tail=null;
            return val;
        }

        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }

        temp.next=null;
        tail=temp;
        return val;
    }

    // main function for adding the element in the Linked List
    public static void main(String args[]) {
        LinkedList2 list = new LinkedList2();

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        list.removeFirst();

        list.addBetween(2, 10);

        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        list.removeLast();

        print();
    }

}


