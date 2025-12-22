import java.util.*;
public class LinkedListSearch4 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        print(list);

        recursiveSearch(list, 8, 0);
    }

    // to determine whether the list is empty or not

    public static boolean isEmpty(LinkedList<Integer> list){
        return list.size()==0;
    }

    // to check whether the key is present in the linked list or not
    public static void recursiveSearch(LinkedList<Integer> list,int key,int index){
        if(isEmpty(list)){
            System.out.println("Linked List is empty");
            return;
        }

        if(index==list.size()){
            
            return ;
        }

        if(list.get(index)==key){
            System.out.println("key is found at the index :"+list.indexOf(key));
        }

        recursiveSearch(list, key, index+1);


    }


    public static void print(LinkedList<Integer> list){
        if(isEmpty(list)){
            System.out.println("Linked list is empty");
             return;
        }
        

        for(int value:list){
            System.out.print(value+" -> ");
        }

        System.out.println("null");
    }


}
