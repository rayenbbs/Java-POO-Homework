package Entities;

import java.util.ArrayList;
import java.util.List;

public class Club  {

    private String clubName;
    private List<Person> members;
    public Club(String clubName) {
        this.clubName = clubName;
        this.members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public void showDescription() {
        System.out.println("Club name: "+clubName);
        System.out.println("The members of this club are:");
        for (Person person : members) {
            System.out.println(person.getFullName());
        }
    }
}
