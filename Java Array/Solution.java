import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
	   
        Scanner scanner = new Scanner(System.in);
        int numberOfInput = scanner.nextInt();
        int[] inputArray = new int[numberOfInput];

        for(int index = 0; index < inputArray.length; index++){
            inputArray[index] = scanner.nextInt();
        }
        scanner.close();

        // Prints each sequential element in array a
        for(int value : inputArray){
            System.out.println(value);
        }
    }
}