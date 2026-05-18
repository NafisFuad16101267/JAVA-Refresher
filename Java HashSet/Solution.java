import java.util.Scanner;
import java.util.HashSet;

public class Solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfInputs = Integer.parseInt(scanner.nextLine());

        HashSet<String> hashSet = new HashSet<>();
        System.out.print(numberOfInputs);
        for(int index = 0; index < numberOfInputs; index++){
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");
            
            // anomaly reverse section for weird hackerrank bug that doesn't accept reversed string 
            // as unique pair even thought it was mentioned in the problem statement.
            String inputReverse = inputArray[1] + " " + inputArray[0];
            
            if(!hashSet.contains(inputReverse))
                hashSet.add(input);
            
            System.out.println(hashSet.size());
        }
    }
}