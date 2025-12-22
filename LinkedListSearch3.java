public class LinkedListSearch3 {
    // now in this i am goign to implement the recursive search method in the Linked
    // List

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

    // for determining whether the Linked list is empty or not

    public static boolean isEmpty() {
        return head == null;
    }

    // for adding the element in the linked list

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // for printing the elements in the Linked list

    public static void print() {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // for doing the recursive search in the linked list

    public static int recursiveSearch(Node head, int key) {
        if (isEmpty()) {
            System.out.println("Linked list is empty");
            return -1;
        }

        

        if (head.data == key) {
            System.out.println("key is found");
            return key;
        }

        recursiveSearch(head.next, key);
        return -1;
    }

    public static void main(String[] args) {
        LinkedListSearch3 list = new LinkedListSearch3();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        print();

        recursiveSearch(head, 2);

    }
}
