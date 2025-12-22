import java.util.*;

public class Stack2 {
    // now i am going to implement the stack using the ArrayList

    public static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        // for determining the arrayList is empty or not
        // for inserting the element in the ArrayList

        public void push(int data) {
           
            list.add(data);
        }

        // for deleting the element form the stack

        public int pop() {
            if (list.size() == 0) {
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //for the peek operation in the stack

        public int peek() {
            if (list.size() == 0) {
                return -1;
            }

            return list.get(list.size() - 1);
        }

        public boolean isEmpty() {
            return list.size() == 0;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

}
