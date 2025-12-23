public class CircularQueue { 

    // heer is the array representation of the circular queue

    public static class Queue{
        static int arr[];
        int size;

        Queue(int n){
            arr=new int[n];
            this.size=n;
        }

        int front=-1;
        int rear=-1;



        // for determining whether the circular queue is empty or not

        public boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        // for determining whether the queue is full or not

        public boolean isFull(){
            return (rear+1)%size==front;
        }

        // for adding the element in the queue thus for the enqueue operations

        public void enqueue(int data){
            if(isFull()){
                System.out.println("the queue is full");
                return;
            }

            if(front==-1){
                front=0;
            }

            rear=(rear+1)%size;
            arr[rear]=data;
        }


        //for deleting the element in the queue

        public int dequeue(){
            if(isEmpty()){
               System.out.println("the queue is empty");
               return -1;
            }

            int remove=arr[front];
            if(front==rear){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }

            return  remove;
        }


        // for the peek operation in the queue

        public int peek(){
            if(isEmpty()){
                System.out.println("the queue is empty");
                return -1;
            }

            return arr[front];
        }
    }


    // the main function for inserting the element in the queue
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(6);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}
