import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int inputNumber= sc.nextInt();
        double inputDecimalNumber = sc.nextDouble();
        sc.nextLine();
        String inputString = sc.nextLine();

        System.out.println("String: " + inputString);
        System.out.println("Double: " + inputDecimalNumber);
        System.out.println("Int: " + inputNumber);

        sc.close();
    }
}
