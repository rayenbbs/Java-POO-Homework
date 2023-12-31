package Classes;

import Interfaces.LibraryUser;

public class Student implements LibraryUser {
    private int age;
    private String name;
    private int studentId;
    private LibraryCard libraryCard;

    public Student(int age, String name, int studentId) {
        this.age = age;
        this.name = name;
        this.studentId = studentId;
        this.libraryCard = new LibraryCard(0);
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public int getStudentId() {
        return studentId;
    }
    @Override
    public void BorrowBook() {
        System.out.println("Student " + this.name + " with ID " + this.studentId + " is borrowing a book");
    }
    @Override
    public void ReturnBook() {
        System.out.println("Student " + this.name + " with ID " + this.studentId + " is returning a book");
    }

}
