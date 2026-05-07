import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args){
        try{
            primitiveTypeDataFitChecker();
        } catch(IOException e){
            System.out.println("An exception occured: " + e.getMessage());
        } catch(Exception e){
            System.out.println("An exception occured: " + e.getMessage());
        }
    }

    public static void primitiveTypeDataFitChecker() throws IOException{

        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

        String firstInputString = bufferReader.readLine();
        String secondInputString = bufferReader.readLine();

        char[] firstInputCharArray = firstInputString.toCharArray();
        firstInputCharArray[0] = Character.toUpperCase(firstInputCharArray[0]);
        char[] secondInputCharArray = secondInputString.toCharArray();
        secondInputCharArray[0] = Character.toUpperCase(secondInputCharArray[0]);

        firstInputString = String.valueOf(firstInputCharArray);
        secondInputString = String.valueOf(secondInputCharArray);

        int charNumber = firstInputString.length() + secondInputString.length();

        System.out.println(charNumber);

        System.out.println((firstInputString.compareTo(secondInputString) > 0) ? "Yes" : "No");
        
        System.out.println(firstInputString + " " + secondInputString);

        bufferReader.close();
    }
}