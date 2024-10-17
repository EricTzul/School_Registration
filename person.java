/*
    CSCI 185 MO1
    Fall 2024
    M1 Lab: Modifiers and Set/Get Methods Lab
    Name: Eric Tzul
    Professor Name: Wenjia Li
    Date: 9/17/24
*/
public class person {
    private String Name;
    private int Age;
    private String SSN;
    private boolean Alive;

    public person(String Name, int Age, String SSN, boolean alive) {
        this.Name = Name;
        this.Age = Age;
        this.SSN = SSN;
        this.Alive = alive;
    }

    public person() {
        this.Name = "David";
        this.Age = 20;
        this.SSN = "12-123-1234";
        this.Alive = true;
    }
    public String getName(){
        return Name;
    }
    public  void setName(String name){
        this.Name = name;
    }

    public int getAge(){
        return Age;
    }
    public void setAge(int age){
        this.Age = age;
    }

    public String getSSN(){
        return SSN;
    }

    public void setSSN(String SSN){
        this.SSN = SSN;
    }
    public boolean getAlive(){
        return Alive;
    }

    public void setAlive(boolean Alive){
        this.Alive = Alive;
    }

    public String toString(){
        String s = "Info Shown Below\n";
        s += "Name: " + this.Name + "\n";
        s += "Age: " + this.Age + "\n";
        s += "SSN: " + this.SSN + "\n";
        s += "Alive: " + this.Alive + "\n";
        return s;
    }

}

