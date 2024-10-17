/*
    CSCI 185 MO1
    Fall 2024
    M1 Lab: Modifiers and Set/Get Methods Lab
    Name: Eric Tzul
    Professor Name: Wenjia Li
    Date: 9/17/24
*/

public class Student {
    private String name;
    private String stu_id;
    private Double gpa;
    private int age;

    public Student(String name, String stu_id, Double gpa, int age) {
        this.age = age;
        this.name = name;
        this.stu_id = stu_id;
        this.gpa = gpa;
    }

    public Student() {
        this.age = 0;
        this.name = "";
        this.stu_id = "";
        this.gpa = 0.0;
    }

    public Student(Student listStudent) {
        this.name = listStudent.name;
        this.stu_id = listStudent.stu_id;
        this.gpa = listStudent.gpa;
        this.age = listStudent.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGPA() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        String s = "Student info is shown as follows:\n";
        s += "Name: " + this.name + "\n";
        s += "Age: " + this.age + "\n";
        s += "Student ID: " + this.stu_id + "\n";
        s += "GPA: " + this.gpa + "\n";
        return s;
    }

    public static void main(String[] args) {
        Student student = new Student("John Doe", "12345", 4.0, 18);
        Student student2 = new Student();
        Student student3 = new Student();

        System.out.println(student.toString() + "\n");

        student2.setName("David");
        student2.setAge(18);
        student2.setGpa(3.9);
        student2.setStu_id("67890");
        System.out.println(student2.toString() + "\n");

        student3.setName("Wayne");
        student3.setAge(17);
        student3.setGpa(3.6);
        student3.setStu_id("29384");

        System.out.println(student3.toString());
    }
}
