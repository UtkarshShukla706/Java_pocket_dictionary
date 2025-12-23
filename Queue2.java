public class Queue2 {
    // for implementation of the queue using the linked list
    // it follows the two operations enqueue and dequeue
    // in enqueue we add the element at the last of the queue

    // in dequeue we remove the element from the front of the queue

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

    public static class Queue {

        // for determining whether the queue is empty or not
        public  boolean isEmpty() {
            return head == null;
        }

        // for adding the element in the queue using the enqueue operations

        public void enqueue(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        // for deleting the element in the queue i e for the dequeue operations

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("the queue is empty");
                return -1;
            }

            int removed = head.data;
            head = head.next;
            return removed;
        }

        // for printing the first element in the queue

        public int peek() {
            if (isEmpty()) {
                System.out.println("the queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q= new Queue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.dequeue();
        }
    }
}
