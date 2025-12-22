public class Stack1 {
    // here i am going to create the stack using the linked list

    // in the stack data is stored in the LIFO format
    // so for the insertion of the element in the stack i am going to use the addFirst method of the Linked list
    // for the deletion of then data i am going to use the remove first operation of the linked list
    // for the peek operation i must return the data of the head node of the linked list

     static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
     }

     public static Node head;
     public static Node tail;

     public static class Stack{

        // for determining whether the stack is empty or not
        public boolean isEmpty(){
            return head==null; 
        }

        // for inserting the element in the stack for the push operations

        public  void push(int data){
            Node newNode =new Node(data);

            if(isEmpty()){
                head=tail=newNode;
                return;
            }

            newNode.next=head;
            head=newNode;
        }


        // for deleting the element in the stack just for the pop operation

        public  int pop(){
            if(isEmpty()){
                return -1;
            }

            int top=head.data;
            head=head.next;
            return top;
        }


        // for the peek operation in the stack 
        public  int peek(){
            if(isEmpty()){
                return -1;
            }

            return head.data;
        }
     }

     public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
     }

}
