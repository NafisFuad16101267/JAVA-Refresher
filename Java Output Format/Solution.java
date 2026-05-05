import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("================================");
        for(int index = 0; index < 3 ; index++)
        {
            String string = scanner.next();
            int number = scanner.nextInt();
            
            // printf formatting rule: %[flags][width][.precision]conversion-character
            System.out.printf("-15%s%d", string, number);
        }
        System.out.println("================================");
    }
}