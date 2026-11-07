package DynamicPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        Animal animal;

        System.out.println("Select an animal: ");
        int choice = scan.nextInt();

        if (choice == 1){
            animal = new Dog();
            animal.speak();
        }

        else if (choice == 2){
            animal = new Cat();
            animal.speak();
        }
    }
}
