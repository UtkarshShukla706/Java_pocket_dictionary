import java.util.Stack;

public class Stack5 {

    // for reversing the stack using recursion
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        reverseStack(s);

        

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }


    public static void pushAtBottom(Stack<Integer> s,int data){
        // if the stack is empty
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }
}
