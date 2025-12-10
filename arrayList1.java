import java.util.*;

// the program is to make the program for finding the maximum number in the array list

public class arrayList1 {
    public static void main(String[] args) {
        // here i am going to make the program for finding the maximum number in the array list
        int max=Integer.MIN_VALUE;
        ArrayList<Integer>list=new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,98));

        for(int i:list){
            if(i>max){
                max=i; 
            }
        }
        System.out.println("the  maximum number in the array List is "+max);
    }
}
