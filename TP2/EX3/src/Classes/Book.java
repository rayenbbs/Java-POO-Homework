package Classes;

import java.time.Year;

public abstract class Book {
    private String title;
    private String author;
    private Year YearOfPublication;

    public Book(String title, String author, Year yearOfPublication) {
        this.title = title;
        this.author = author;
        YearOfPublication = yearOfPublication;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public Year getYearOfPublication() {
        return YearOfPublication;
    }

    public void displayInformation() {}
}