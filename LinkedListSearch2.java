import java.util.*;


public class LinkedListSearch2 {
    // now in this i am going to implement the iterartive search using the collection frameworks in the java

    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        print(list);

        iterativeSearch(list,4);
    }

    // for checking the Linked list is empty or not

    public static boolean isEmpty(LinkedList<Integer> list){
        return list.size()==0;
    }


    // for printing the Linked List

    public static void print(LinkedList<Integer> list){
        if(isEmpty(list)){
            System.out.println("Linked list is empty");
            return;
        }

        for(int value:list){
            System.out.print(value +" ->");
        }

        System.out.println("null");
    }

    // for doing the iterative search in the linked list

    public static int iterativeSearch(LinkedList<Integer> list,int key){
        for(int value:list){
            if(value==key){
                System.out.println("key is found at the index: "+list.indexOf(value));
                return key;
            }
        }

        return -1;
    }
}
