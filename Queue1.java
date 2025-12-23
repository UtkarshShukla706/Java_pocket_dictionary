public class Queue1 {
    // here i am going to implement the queue using the array

    // Queue is the data structure that is used to store the data in the FIFO
    // order(First in first out)
    // in Queue that is inserted first will be removed first

    public static class Queue {
        static int arr[];
        int size;

        int rear = -1;
        int front = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        // for determining whethere the queue is empty or not

        public boolean isEmpty() {
            return front == -1||front>rear;
        }

        // for adding the lement in the queue we are going to perform the enqueue
        // operations

        public void enqueue(int data) {
            if (rear == size - 1) {
                System.out.println("the queue is full");
                return;
            }

            if(front==-1){
                front=0;
            }
            rear++;

            arr[rear] = data;
            
        }

        // for removing the element in the queue using the dequeue operations

        public int dequeue() {

            if (isEmpty()) {
                System.out.println("the queue is empty");
                return -1;
            }
            int removed = arr[front];
            front++;

            return removed;
        }

        // for printing the first element in the queue we are going to use the peek
        // operation

        public int peek() {
            if (isEmpty()) {
                System.out.println("the queue is empty");
                return -1;
            }

            return arr[front];
        }
    }

    // the main function for the insertion of the element in the queue

    public static void main(String[] args) {
        Queue q= new Queue(4);

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
