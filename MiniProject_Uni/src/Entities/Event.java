package Entities;

import java.util.ArrayList;
import java.util.List;

public class Event {
    public  String name;
    public  String date;
    public  Club club;

    private List<Person> participants;

    public Event(String name, String date,  Club club) {
        this.name = name;
        this.date = date;
        this.club = club;
        this.participants=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void addParticipant(Person person) {
        participants.add(person);
    }

    public void showParticipants() {
        System.out.println("Event name: "+name);
        System.out.println("The participants of this event are:");
        for (Person person : participants) {
            System.out.println(person.getFullName());
        }
    }




    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }


}
