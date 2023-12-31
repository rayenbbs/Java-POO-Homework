package Classes;

import Interfaces.LibraryUser;

public class Teacher implements LibraryUser {
    private int age;
    private String name;
    private int teacherId;
    private LibraryCard libraryCard;

    public Teacher(int age, String name, int teacherId) {
        this.age = age;
        this.name = name;
        this.teacherId = teacherId;
        this.libraryCard = new LibraryCard(0);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public void BorrowBook() {
        System.out.println("Teacher " + this.name + " with ID " + this.teacherId + " is borrowing a book");
    }

    @Override
    public void ReturnBook() {
        System.out.println("Teacher " + this.name + " with ID " + this.teacherId + " is returning a book");
    }
}
