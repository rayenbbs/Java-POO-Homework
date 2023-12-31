package Entities;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Student> members;

    public Group(String name) {
        this.name = name;
        this.members = new ArrayList<>();

    }
    public void showMembers() {
        System.out.println("Group name: "+name);
        System.out.println("The members of this group are:");
        for (Student student : members) {
            System.out.println(student.getFullName());
        }
    }


    public void join(Student student) {
        members.add(student);
    }


    public void leave(Student student) {
        members.remove(student);
    }
}
