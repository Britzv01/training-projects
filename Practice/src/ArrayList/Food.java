package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Food {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("How many items would you like?");
        int numItems = scan.nextInt();
        scan.nextLine();
        System.out.println("------------------------------");

        System.out.println("Enter your items");
        for (int i = 0; i < numItems; i++){
            System.out.printf("Food #%d: ", (i + 1));
            foods.add(scan.nextLine());
        }

        for (String food : foods){
            System.out.println(food + " | ");
        }

    }
}
