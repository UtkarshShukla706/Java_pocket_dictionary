import java.util.*;

public class arrayList2 {
    // swap the two number in the array list
    public static void main(String[] args) {

        try {
            ArrayList<Integer> list = new ArrayList<>();
            int x1 = 0;
            int x2 = 5;
            list.addAll(Arrays.asList(2, 3, 9, 6, 5, 8));
            System.out.println("the original array List is :" + list);
            swap(list, x1, x2);

            System.out.println("the array list after the swapping of the two numbers: "+list);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("the compiler is generating the default try again");
        }
    }

    public static void swap(ArrayList<Integer> list, int x1, int x2) {
        int temp = list.get(x1);
        list.set(x1, list.get(x2));
        list.set(x2, temp);
    }

}
