package GetterSetter;

public class Main {
    public static void main(String [] args){
        Car car = new Car("Mustang", "Black", 120000);


        System.out.println(car.getColor() + car.getModel() + car.getPrice());

        car.setColor("Blue");
        car.setPrice(-100);

        System.out.println(car.getColor() + car.getModel() + car.getPrice());

    }
}
