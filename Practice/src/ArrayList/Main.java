package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Integer Array List
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(2);
        list.add(1);

        // String Array List
        ArrayList <String > lists = new ArrayList<>();

        // Add item in the array
        lists.add("Apple");
        lists.add("Banana");
        lists.add("Orange");

        // Remove item in the array
        lists.remove(2);

        // Change the value in the array
        lists.set(1, "Grapes");

        // Fetch the specific element at the specified index
        System.out.println(lists.get(0));

        // Get the size of the list
        System.out.println(lists.size());

        // Sort the list alphabetically
        Collections.sort(lists);
        System.out.println(lists);

        for (String fruits : lists){
            System.out.println(fruits);
        }
    }
}
