package Entities;


public class Course{

    private String courseName;
    Teacher teacher;
    private Group group;
    private Subject subject;


    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void assignSubject(Subject subject) {
        this.subject = subject;
    }

    public void setGroup(Group group) {
        this.group=group;
    }

    public void assignTeacher(Teacher teacher) {
        this.teacher=teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }





    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public Subject getSubject() {
        return subject;
    }
    public void showDescription() {
        System.out.println("Course name: "+courseName);
        System.out.println("Subject: "+subject.getName());
        System.out.println("Teacher: "+teacher.getFullName());
        System.out.println("Group: ");
        group.showMembers();
    }
}