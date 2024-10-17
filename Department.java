public class Department {

    private String deptName;
    private int num_majors;
    private Teacher[] listTeachers;
    private Student[] listStudents;

    public Department(String deptName, int numMajors) {
        this.deptName = deptName;
        this.num_majors = numMajors;
        this.listTeachers = new Teacher[3];
        this.listStudents = new Student[5];

    }

    public Department() {
        this.deptName = "";
        this.num_majors = 0;
        this.listTeachers = new Teacher[3];
        this.listStudents = new Student[5];
    }

    public int getNumMajors() {
        return num_majors;
    }

    public void setNum_majors(int NumMajors) {
        this.num_majors = NumMajors;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void addTeacher(Teacher teacher, int index) {
        if (index >= 0 && index < listTeachers.length) {
            listTeachers[index] = teacher;
        }
    }

    public void addStudent(Student student, int index) {
        if (index >= 0 && index < listStudents.length) {
            listStudents[index] = student;
        }
    }

    public String toString() {
        String s = "Info Show Below: \n";
        s += "Department Name: "+ this.deptName + "\n";
        s += "Number of Majors: " + this.num_majors + "\n";
        for (Teacher teacher : listTeachers) {
            if (teacher != null) {
                s += (teacher.toString()) + ("\n");
            }
        }
        s += ("Students:\n");
        for (Student student : listStudents) {
            if (student != null) {
                s += (student.toString()) + ("\n");
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        Department csDepartment = new Department("Computer Science", 50);
        Department mathDepartment = new Department("Mathematics", 30);

        Teacher teacher1 = new Teacher("1456943", 60000, 1);
        Teacher teacher2 = new Teacher("0934892", 90000, 2);
        Teacher teacher3 = new Teacher("8934855", 40000, 3);

        Student student1 = new Student("1982384", 3.8, "Freshman");
        Student student2 = new Student("S002", 3.6, "Sophomore");
        Student student3 = new Student("S003", 3.9, "Junior");
        Student student4 = new Student("S004", 2.8, "Senior");
        Student student5 = new Student("S005", 3.5, "Freshman");

        csDepartment.addTeacher(teacher1, 0);
        csDepartment.addTeacher(teacher2, 1);
        csDepartment.addTeacher(teacher3, 2);

        csDepartment.addStudent(student1, 0);
        csDepartment.addStudent(student2, 1);
        csDepartment.addStudent(student3, 2);
        csDepartment.addStudent(student4, 3);
        csDepartment.addStudent(student5, 5);

        mathDepartment.addTeacher(teacher1, 0);
        mathDepartment.addTeacher(teacher2, 1);
        mathDepartment.addTeacher(teacher3, 2);

        mathDepartment.addStudent(student1, 0);
        mathDepartment.addStudent(student2, 1);
        mathDepartment.addStudent(student3, 2);
        mathDepartment.addStudent(student4, 3);
        mathDepartment.addStudent(student5, 4);


        System.out.println(csDepartment);
        System.out.println(mathDepartment);
    }
}
