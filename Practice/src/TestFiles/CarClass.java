package TestFiles;

public class CarClass {
    String model;
    String color;
    String [] parts;

    CarClass(String model, String color){
        this.model = model;
        this.color = color;
    }

    CarClass(String... parts){
        this.parts = parts;
    }

    void drive(){
        System.out.printf("You drive the %s %s", color, model);
    }

    void showParts(){
        for(int i = 0; i < parts.length; i++){
            System.out.println(parts[i]);
        }
    }

    static void main() {
       /* TestFiles.CarClass car1 = new TestFiles.CarClass("Honda", "Black");
        TestFiles.CarClass car2 = new TestFiles.CarClass("Mitsubishi", "White");
        TestFiles.CarClass car3 = new TestFiles.CarClass("Ferrari", "Red");
        TestFiles.CarClass car4 = new TestFiles.CarClass("Window", "Windshield", "Handle", "Brake");

        TestFiles.CarClass[] cars = {car1, car2, car3, car4};
       */

        CarClass[] cars = {new CarClass("Honda,", "Black"), new CarClass("Mustang", "Blue")};

        for (int i = 0; i < cars.length; i++){
            cars[i].drive();
            System.out.println("");
        }

        for (CarClass carits : cars){
            carits.drive();
            System.out.println("");
        }
    }

}
