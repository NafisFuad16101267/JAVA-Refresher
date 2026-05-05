import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int inputNumber = scanner.nextInt();

        // this regular expression is used to skip lines
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(inputNumber % 2 != 0){
            System.out.println("Weird");
        } else if(inputNumber >= 6 && inputNumber <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}