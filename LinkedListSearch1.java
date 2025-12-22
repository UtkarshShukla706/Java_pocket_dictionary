public class LinkedListSearch1 {

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

    // for determining whether the linked list is empty or not

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

    // for doing then iterating search in the linked list

    public static int iterativeSearch(int key) {
        Node temp = head;

        int index = 0;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("key is found at the index: " + index);
            }

            temp = temp.next;
            index++;
        }

        return -1;

    }

    public static void print() {

        if (isEmpty()) {
            System.out.println("linked list is empty");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;

        }

        System.out.println("null");
    }

    public static void main(String args[]) {
        LinkedListSearch1 list = new LinkedListSearch1();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        print();

        iterativeSearch(25);

    }
}