/*
    CSCI 185 MO1
    Fall 2024
    M1 Lab: Composition Lab
    Name: Eric Tzul
    Professor Name: Wenjia Li
    Date: 9/26/24
*/


public class Course{
    public String courseName;
    private String courseNumber;
    public String instructorName;
    private Student[] listStudents;

    public Course(String courseName, String courseNumber, String instructorName, Student[] listStudents) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.instructorName = instructorName;
        this.listStudents = new Student[listStudents.length];
        for (int i = 0; i < listStudents.length; i++) {
            this.listStudents[i] = new Student(listStudents[i]);
        }
    }

    public Course(){
        this.courseName = "Social Studies";
        this.courseNumber = "MO1";
        this.instructorName = "Wilson";
        this.listStudents = new Student[0];

    }


    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getcourseNumber(){
        return courseNumber;
    }
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getInstructorName(){
        return instructorName;
    }
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public Student[] getListStudents() {
        return listStudents;
    }

    public void setListStudents(Student[] listStudents) {
        this.listStudents = new Student[listStudents.length];
        for (int i = 0; i < listStudents.length; i++) {
            this.listStudents[i] = new Student(listStudents[i]);
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder("Course Details:\n");
        s.append("Course Name: ").append(this.courseName).append("\n");
        s.append("Course Number: ").append(this.courseNumber).append("\n");
        s.append("Instructor: ").append(this.instructorName).append("\n");

        s.append("\nEnrolled Students:\n");
        if (listStudents != null && listStudents.length > 0) {
            for (Student student : listStudents) {
                s.append(student.toString()).append("\n");
            }
        } else {
            s.append("No students enrolled.\n");
        }

        return s.toString();
    }

    public static void main(String[] args) {
        Student[] studentsForCS = {
                new Student("John", "12345", 4.0, 18),
                new Student("David", "67890", 3.9, 18),
                new Student("Wayne", "29384", 3.6, 17)
        };

        Student[] studentsForSocialStudies = {
                new Student("Henry", "11223", 3.8, 19),
                new Student("Bob", "44556", 3.7, 20),
                new Student("Naifry", "77889", 3.5, 18)
        };

        Course c1 = new Course("Computer Science", "MO1", "Henry", studentsForCS);
        Course c2 = new Course("Social Studies", "MO2", "Wilson", studentsForSocialStudies);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }

}
