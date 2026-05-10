import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean isAnagram = true;

        String firstInputString = a.toUpperCase();
        String secondInputString = b.toUpperCase();

        char[] firstInputCharArray = firstInputString.toCharArray();
        char[] secondInputCharArray = secondInputString.toCharArray();

        int[] firstStringAlphabetFrequency = new int[26];
        int[] secondStringAlphabetFrequency = new int[26];

        for(int index = 0; index < firstInputCharArray.length; index++)
            firstStringAlphabetFrequency[((int)firstInputCharArray[index]) - 65]++;
            
        
        for(int index2 = 0; index2 < secondInputCharArray.length; index2++)
            secondStringAlphabetFrequency[((int)secondInputCharArray[index2]) - 65]++;
            
        
        for(int alphabetArrayIndex = 0; alphabetArrayIndex < 26; alphabetArrayIndex++){
            if(firstStringAlphabetFrequency[alphabetArrayIndex] != secondStringAlphabetFrequency[alphabetArrayIndex]){
                isAnagram = false;
                break;
            }
        }

        return isAnagram;   
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
