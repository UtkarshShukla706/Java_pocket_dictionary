import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        // it is used to add the element in the array list

        // 1.add(object)

        list.add("Utkarsh");
        list.add("Gajendra");
        list.add("Akhil");

        // .add(index,object)

        list.add(1, "Purohit");

        list.add(3, "Priyanshi");

        // 2 .remove() it is used to remove the element from the arraylist

        // remove(index)
        list.remove(3);

        // remove(object)
        list.remove("Gajendra");

        System.out.println("remove the element of the array");

        for (String n : list) {
            System.out.println(n);
        }

        // 3.get() used to find whether the element is present in the arraylist or not

        System.out.println(list.get(2));

        // set(index,object) it is used to update the arraylist data thatis already
        // existed.

        list.set(1, "Rohit");

        System.out.println("update the element of the array");

        for (String n : list) {
            System.out.println(n);
        }

        // size() it is used to check the size of the arrayList

        System.out.println("the size of the arraylist is");

        System.out.println(list.size());

        // isEmpty() it is used to check whether the arrayList is empty or not

        if (list.isEmpty())
            System.out.println("the arrayList is empty");
        else
            System.out.println("the arrayList is not empty");

        // contains() it is used to check whether the element is present in the
        // arrayList or not

        if (list.contains("Rohit"))
            System.out.println("Rohit is present in the collection of the array List");
        else
            System.out.println("Rohit is absent");

        // to add extra element in the arrayList we use .addAll() method

        System.out.println("All the elements get added in the arrayList");

        list.addAll(Arrays.asList("Priyanshi", "kejriwal"));

        for (String n : list) {
            System.out.println(n);
        }

        // to copy the arrayList we use .copy() method

        // ArrayList<String> list2= (ArrayList<String>)list.clone();

        // System.out.println("the copied arraylist is");
        // for(String n2: list2){
        // System.out.println(n2);
        // }

    }
}

// in java array List is the dynamic array that is automatically shrink or
// reduce at the time when the data is get entered
