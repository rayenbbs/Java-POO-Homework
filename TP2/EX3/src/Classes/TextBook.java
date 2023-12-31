package Classes;

import java.time.Year;

public class TextBook extends Book{
    public TextBook(String title, String author, int yearOfPublication) {
        super(title, author, Year.of(yearOfPublication));
    }

    @Override
    public void displayInformation() {
        System.out.println("TextBook: " + getTitle() + " by " + getAuthor() + " published in " + getYearOfPublication());
    }
}
