
import Entities.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // create some students
        Student student0 = new Student("1", "Mohamed", "besbes");
        Student student1 = new Student("2", "Rayen", "besbes");
        Student student2 = new Student("3", "Ahmed", "besbes");
        // create some teachers
        Teacher teacher0 = new Teacher("1", "achref", "hallel",500);
        Teacher teacher1 = new Teacher("2", "mohamed", "hallel",650);
        Teacher teacher2 = new Teacher("3", "ahmed", "hallel",700);
        // create some subjects
        Subject subject0 = new Subject("Algebre");
        teacher0.assignSubject(subject0);
        Subject subject1 = new Subject("analyse");
        teacher1.assignSubject(subject1);

        // create some courses
        Course course0 = new Course("Algebre");
        course0.assignSubject(subject0);
        course0.assignTeacher(teacher0);
        Course course1 = new Course("Analyse");
        course1.assignSubject(subject1);
        course1.assignTeacher(teacher1);
        // Enroll students in courses
        student0.enrollStudent(course0);
        student0.enrollStudent(course1);
        student2.enrollStudent(course0);
        System.out.println("student0 enrolled courses: ");
        student0.showEnrolledCourses();
        System.out.println("-------------------------------");

        System.out.println("student2 enrolled courses: ");
        student2.showEnrolledCourses();
        System.out.println("-------------------------------");


        // Initiate some groups
        System.out.println("Showing the groups: \n");
        Group algebreGroup = new Group("Algebre Group");
        algebreGroup.join(student0);
        algebreGroup.join(student1);
        algebreGroup.join(student2);
        Group analyseGroup = new Group("Analyse Group");
        analyseGroup.join(student2);
        algebreGroup.showMembers();
        System.out.println("-------------------------------");
        analyseGroup.showMembers();
        System.out.println("-------------------------------");

        // adding a group to a course
        course0.setGroup(algebreGroup);
        System.out.println("Showing a course after a group was assigned to it\n");
        course0.showDescription();
        System.out.println("-------------------------------");

        // creating a club
        System.out.println("Showing a club...");
        Club algebreClub = new Club("We love algebre");
        algebreClub.addMember(student0);
        algebreClub.addMember(student1);
        algebreClub.addMember(teacher0);
        algebreClub.showDescription();
        System.out.println("-------------------------------");

        // create an event of this club
        System.out.println("Showing an event of the club...");
        String eventDate="05/11/2003";
        Event algebreEvent = new Event("Electro Event", eventDate, algebreClub);
        System.out.println("Showing the participants of the club's event");
        algebreEvent.addParticipant(student0);
        algebreEvent.addParticipant(student2);
        algebreEvent.showParticipants();
        System.out.println("-------------------------------");

    }
}