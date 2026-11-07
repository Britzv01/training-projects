package Aggregation;

public class Library {
    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.printf("The %d %s", year, name);
        System.out.println("Books available: ");
        for (Book book : books){
            book.displayInfo();
        }
    }
}
