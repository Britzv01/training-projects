package GetterSetter;

public class Car {
    // private makes the variable only accessible within this class
    // final makes the variable immutable even by setter methods
    // getters and setters help protect object data and enforce roles for accessing or modifying them

    private final String model;
    private String color;
    private int price;

    Car(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel(){
        return this.model;
    }

    String getColor(){
        return this.color;
    }

    String getPrice(){

        return "$" + this.price;
    }

    void setColor(String color){
        this.color = color;
    }

    void setPrice(int price){
        if (price < 0 ){
            System.out.println("Price cannot be less than 0");
        }

        else {
            this.price = price;
        }
    }
}
