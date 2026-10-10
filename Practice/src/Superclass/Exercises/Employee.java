package Superclass.Exercises;

public class Employee {
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }


}

class Manager extends Employee{
    int bonus;

    Manager(String name, double salary, int bonus){
        super(name, salary);
        this.bonus = bonus;
    }
}
