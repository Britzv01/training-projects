package Aggregation;

public class Main {
    public static void main(String [] args){
        Book book1 = new Book("Carp and the Carper", 100);
        Book book2 = new Book("Atomic Habits", 120);
        Book book3 = new Book("Lion King", 200);

        Book[] books = {book1, book2, book3};

        Library library = new Library("Nigga", 1984, books);

        library.displayInfo();
    }
}
