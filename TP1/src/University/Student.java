package University;

public class Student {
    private int studentID;
    private String firstName;
    private String lastName;
    private Course[] courses;

    public Student(int studentID, String firstName, String lastName, int nbCourses) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        courses = new Course[nbCourses];
    }

    public int getStudentID() {
        return studentID;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void enroll(Course course) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] != null && courses[i].getCourseID() == course.getCourseID()) {
                throw new IllegalArgumentException("course already exists");
            }
        }
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = course;
                return;
            }
        }
        throw new IllegalArgumentException("Course limit exceeded");
    }
    public Course[] getCourses() {
        System.out.print("Courses: ");
        for(Course c : courses) {
            if (c != null){
                System.out.print(c.getCourseName()+" ");
            }else{
                break;
            }
        }
        return courses;
    }

    public static void main(String[] args) {
        Student s0 = new Student(0, "ali", "besbes", 3);
        Student s1 = new Student(1, "johnny", "depp", 3);
        Instructor i0 = new Instructor(0, "anouer", "lasmer");
        Instructor i1 = new Instructor(1, "ahmed", "jaballah");
        Course c0 = new Course(0, "Gestion", i0);
        Course c1 = new Course(1, "Statistique", i1);
        s0.enroll(c0);
        s0.enroll(c1);
        s1.enroll(c0);
        s0.getCourses();
    }
}