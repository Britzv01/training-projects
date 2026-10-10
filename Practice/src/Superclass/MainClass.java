package Superclass;

public class MainClass {
    public static void main(String[] args){
        Person person = new Person("Danzhel", "Sardoncillo");
        Student student = new Student("Onycah", "Quiban", 4.00);
        Employee employee = new Employee("Danycah", "Sardoncillo", 500000);

        student.showName();
        student.showGPA();

        person.showName();

        employee.showName();
        employee.showSalary();
    }
}
