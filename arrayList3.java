import java.util.ArrayList;
import java.util.Arrays;

public class arrayList3 {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 5, 6));

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7, 8, 9, 10));

        
        list.add(list1);
        list.add(list2);

        
        for (int i = 0; i < list.size(); i++) {
            ArrayList<Integer> currList = list.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
