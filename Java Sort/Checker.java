import java.util.Comparator;

public class Checker implements Comparator<Student>{

    @Override
    public int compare(Student student1, Student student2){
        if(student1.cgpa == student2.cgpa){
            if(student1.fname.compareTo(student2.fname) == 0)
                return student1.id - student2.id;
            else
                return (student1.fname.compareTo(student2.fname));
        }
        return (int)(student1.cpga - student2.cgpa);
    }
}