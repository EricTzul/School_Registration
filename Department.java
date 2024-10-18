
public class Department {
    private Professor chair;
    private listProfessor[];
    private listCourse[];

    public Department(Professor chair, listProfessor[], listCourse) {
        this.chair = chair;
        this.listProfessor = new Professor[listProfessor.length];
        for(int i = 0; i < listProfessor.length; i++){
            this.listProfessor[i] = new Professor(listProfessor[i]);
        }
        this.listCourse = new Course[ListCourse.length];
        for(int i = 0; i < listCourse.length; i++){
            this.listCourse[i] = new Professor(listProfessor[i]);
        }
    }

    public void addFaculty(Professor prof){
        listProfessor.add(prof);
    }

    public void addCourse(Course course){
        listCourse.add(course);
    }

    public String toString(){
        String s = "Info Shown Below\n";
        s += "Department Chair: " + listProfessor + "\nFaculty: ";
        for(Professor prof : listProfessor){
            s += prof.toString() + "\n";
        }
        s  += "Courses: ";
        for(Course course : listCourse){
            return += course.toString() + "\n";
        }
        return s;
    }
}

