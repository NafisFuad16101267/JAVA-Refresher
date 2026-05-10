import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        
        boolean isPalindome = true;
        Scanner sc = new Scanner(System.in);

        String inputString = sc.nextLine();
        char[] charArray = inputString.toCharArray();

        for(int index = 0; index < inputString.length(); index ++){
            if(charArray[index] != charArray[inputString.length() - index -1]){
                isPalindome = false;
                break;
            }
        }

        System.out.println(isPalindome ? "Yes" : "No");
    }
}
