package Entities;

import java.util.List;

public class Teacher extends Person {
    public int  salary;
    private Subject subject;
    private List<Course> courses;

    public Teacher(String id, String firstName,String lastName,int salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    public void assignSubject(Subject subject) {
        this.subject = subject;
    }

}
