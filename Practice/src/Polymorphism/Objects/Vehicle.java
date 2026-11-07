package Polymorphism.Objects;

public abstract class Vehicle {

    abstract void go();

    public static void main(String [] args){
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicles[] vehicle = {car, bike, boat};
        int[] numbers = {0, 2, 4, 6};

        /*for(int i = 0; i < vehicle.length; i++){
            vehicle[i].go();
        }
        */

        for (Vehicles vehicles : vehicle){
            vehicles.go();
        }
    }
}

class Car implements Vehicles {
    @Override
    public void go(){
        System.out.println("You drive the car");
    }
}

class Bike implements Vehicles {
    @Override
    public void go(){
        System.out.println("You ride the bike");
    }
}

class Boat implements Vehicles {
    @Override
    public void go(){
        System.out.println("You sail the boat");
    }
}
