package Entities;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private int credits;

    private List<Course> courses;

    public Student(String id, String firstName,String lastName) {
        super(id, firstName, lastName);
        this.credits = 0;
        this.courses = new ArrayList<>();
    }

    public void enrollStudent(Course course) {
        courses.add(course);
    }

    public void showEnrolledCourses() {
        for (Course course : courses) {
            System.out.println("Course name: "+course.getCourseName()+" Subject: "+course.getSubject().getName()+" Teacher: "+course.getTeacher().getFullName());
        }
    }
    public void joinGroup(Group group) {
        group.join(this);
    }


    public void leaveGroup(Group group) {
        group.leave(this);
    }

}
