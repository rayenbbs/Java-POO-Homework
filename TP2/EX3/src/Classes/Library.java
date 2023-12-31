package Classes;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private int numberOfBooks;

    public Library() {
        this.books = new ArrayList<>();
        this.numberOfBooks = 0;
    }
    public void addBook(Book book) {
        this.books.add(book);
        this.numberOfBooks++;
    }
    public void removeBook(Book book) {
        this.books.remove(book);
        this.numberOfBooks--;
    }
    public void displayBooks() {
        for (Book book : books) {
            book.displayInformation();
        }
    }
    public void displayNumberOfBooks() {
        System.out.println("Number of books: " + this.numberOfBooks);
    }
}
