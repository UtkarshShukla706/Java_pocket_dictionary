import java.util.ArrayList;
import java.util.List;

public class collectionsDemo {
    public static void main(String[] args) {

        // for initializing the array list we need to create the object for it first so
        // that it start working

        List<String> names = new ArrayList<>();

        names.add("Utkarsh");
        names.add("gajendra");
        names.add("akhil");

        for (String n : names) {
            System.out.println(n);
        }

    }
}

// in this we uses the arraylist to store the values
