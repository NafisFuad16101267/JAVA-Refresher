public class Student{
    public int id;
    public String fname;
    public double cgpa;

    public Student(int id, String fname, double cgpa){
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId(){
        return id;
    }

    public String getFname(){
        return fname;
    }

    public double getCgpa(){
        return cpga;
    }
}