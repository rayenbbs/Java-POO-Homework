package University;

    public class Instructor {
        private int instructorID;
        private String firstName;
    private String lastName;
    public Instructor(int instructorID, String firstName, String lastName) {
        this.instructorID = instructorID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
        public String getFirstName() {
            return firstName;
        }
    public int getInstructorID() {
        return instructorID;
    }

    public String getLastName() {
        return lastName;
    }
}