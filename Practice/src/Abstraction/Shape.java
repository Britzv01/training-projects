package Abstraction;

public abstract class Shape {
    abstract double area();

    void display(){
        System.out.println("This is a shape");
    }

    public static void main(String [] args){
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(6, 7);
        Triangle triangle = new Triangle(4, 5);

        Shape[] shapes = {circle, rectangle, triangle};

        for(int i = 0; i < shapes.length; i++){
            System.out.println(shapes[i].area());
        }
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    double area(){
        return length * width;
    }
}

class Triangle extends Shape {

    double base;
    double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area(){
        return 0.5 * base * height;
    }
}