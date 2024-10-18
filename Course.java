/*
    CSCI 185 MO1
    Fall 2024
    M1 Lab: Composition Lab
    Name: Eric Tzul
    Professor Name: Wenjia Li
    Date: 9/26/24
*/


public class Course{
    private Professor instructor;
    private listCollegeStudent[];
    private String CourseName;

    public Course(Professor instructor, listCollegeStudents[], String CourseName){
        this.CourseName = CourseName;
        this.instructor = instructor;
        this.listCollegeStudents = new CollegeStudent[listCollegeStudents.length];
        for(int i = 0; i < listCollegeStudents.length; i++){
            this.listCollegeStudents[i] = new CollegeStudent(listCollegeStudents[i]);
        }
    }

    public void addStudent(CollegeStudent student){
        student.add(student);
    }

    public String toString(){
       String s = "Info Shown Below:\n";
       s += "Course Name: " + this.CourseName + "\n";
       s += "Instructor: " + this.instructor + "\n";
       for(CollegeStudent student: students){
           s += student.toString() + "\n";
       }
       return s;

    }
}
