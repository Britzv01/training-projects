package Inheritance;

public class Dog extends Animal {
    int lives = 1;

    void speak(){
        System.out.println("The dog barks!");
    }

    public static void main(String [] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println((dog.isAlive) ? "Dog is Alive" : "Dog is not Alive");
        System.out.println((cat.isAlive) ? "Cat is Alive" : "Cat is not Alive");
        System.out.println((plant.isAlive) ? "Plant is Alive" : "Plant is not Alive");

        plant.photosynthesize();
        /*
        dog.poop();
        cat.poop();

        dog.speak();
        cat.speak();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

         */
    }
}
