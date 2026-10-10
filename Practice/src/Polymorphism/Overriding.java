package Polymorphism;

public class Overriding {

    void move(){
        System.out.println("The animal is moving");
    }

    static void main() {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }

}

class Dog extends Overriding {

}

class Cat extends Overriding{
    @Override
    void move(){
        System.out.println("The animal is prancing");
    }
}

class Fish extends Overriding {

    @Override
    void move(){
        System.out.println("This animal is swimming!");
    }
}
