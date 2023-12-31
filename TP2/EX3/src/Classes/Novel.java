package Classes;

import java.time.Year;

public class Novel extends Book{
    public Novel(String title, String author, int yearOfPublication) {
        super(title, author, Year.of(yearOfPublication));
    }

    @Override
    public void displayInformation() {
        System.out.println("Novel: " + getTitle() + " by " + getAuthor() + " published in " + getYearOfPublication());
    }

}
