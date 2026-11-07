package toStringMethod;

public class Car {
    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
        return make + " " + model + " " + year + " " + color;
    }

    public static void main(String [] args){
        Car car1 = new Car("Honda", "Click", 2022, "Pink");
        Car car2 = new Car("Ford", "Mustang", 2012, "Black");

        System.out.println(car1);
        System.out.println(car2);
    }
}
