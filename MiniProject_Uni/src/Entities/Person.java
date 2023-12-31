
package Entities;
public class Person {
    public String id;
    public String firstName;
    public String lastName;


    public Person(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
