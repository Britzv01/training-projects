package Composition;

public class Main {
    public static void main (String [] args){
        Car car = new Car("Corvette", 2025, "V8");

        System.out.println(car.model + car.year);

        car.start();
    }
}
