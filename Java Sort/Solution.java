import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfInputs = scanner.nextInt();
        Checker checker = new Checker();

        List<Student> studentList = new ArrayList<>();

        for(int inputIndex = 0; inputIndex < numberOfInputs; inputIndex++){
            int id = scanner.nextInt();
            String fname = scanner.next();
            double cgpa = scanner.nextDouble();

            Student student = new Student(id, fname, cgpa);

            studentList.add(student);
        }

        studentList.sort(checker);

        for(Student student : studentList){
            System.out.println(student.fname);
        }
    }
}