package toStringMethod;

public class Book {
    String title;
    String author;
    int pageCount;

    Book(String title, String author, int pageCount){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    @Override
    public String toString(){
        String display = String.format("""
                Title: %s
                Author: %s
                Page Count: %d
                """, title, author, pageCount);
        return display;
    }

    public static void main(String[] args) {
        Book book = new Book("The Black Cat", "Edgar Allan Poe", 141);

        System.out.println(book);
    }
}
