import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        int startIndex = sc.nextInt();
        int endIndex = sc.nextInt();

        String outputString = inputString.substring(startIndex, endIndex);

        System.out.println(outputString);
    }
}