public class Teacher extends Department{
    private String id;
    private int Salary;
    private int num_yr_professor;

    public Teacher(String id, int Salary, int num_yr_professor){
        this.id = id;
        this.Salary = Salary;
        this.num_yr_professor = num_yr_professor;
        }


    public  Teacher(){
        this.id = "";
        this.Salary = 0;
        this.num_yr_professor = 0;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public int getSalary(){
        return Salary;
    }

    public void setSalary(int Salary){
        this.Salary = Salary;
    }

    public int getNum_yr_professor(){
        return num_yr_professor;
    }
    public void setNum_yr_professor(int num_yr_professor){
        this.num_yr_professor = num_yr_professor;
    }


    public String toString(){
        return super.toString() + "ID: " + this.id + "\n" +
                "Salary: " + this.Salary + "\n" +
                "Number of Years: " + this.num_yr_professor + "\n";
    }


}
