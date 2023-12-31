Welcome to the university management system:

Person Class:
Has id, and name attributes and getter method to get the fullname.

Student Class extends Person class: 
Has a list of the courses the student is enrolled in.
Student has ID and name attributes inherited from person.
Student can enroll in a course,join or leave groups.

Teacher Class extends Person class:
Teacher has ID and name attributes inherited from person.
Has salary(int), Subject, and a list of courses as attributes, teacher has a method that sets his subject(assignSubject)

Subject Class:
Has a name attribute and its getters and setters.

Group Class:
Has name and list of students as attributes.
Members can be added or deleted from a Group by join and leave methods.
ShowMembers method to display the members of the group.


Event class:
Name,Date, club and list of participants as attributes.
Methods: getters and setters, add Participant to the List and showAllParticipants

Course Class:

Has course name,teacher, group and subject as Attributes.
its getters and setters.
A course has a group and teacher assigned to it.
showDescription method to show details of the course.

Club Class:
Has clubName and list of members as attribtues.
Getters and setters.
method to add member to memberList.
showDescription Method that outputs details.

MAIN class:
Initialising everything and trying out the functionalities.


