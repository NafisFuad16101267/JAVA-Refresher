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
            System.out.println("can't be fitted anywhere.");
        }
    }

    public static void primitiveTypeDataFitChecker() throws IOException{
        // 8 primitive data type of java : char, boolean, byte, short, int, long, float, and double

        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

        long number = Long.parseLong(bufferReader.readLine().trim());

        System.out.println(number + " can be fitted in:");

        if(number >= -128 && number <= 127){
            System.out.println("* byte");
        } 
        if(number >= -32768 && number <= 32767){
            System.out.println("* short");
        }
        if(number >= Math.pow(-2, 31) && number <= (Math.pow(2, 31) - 1)){
            System.out.println("* int");
        }
        if(number >= Math.pow(-2, 63) && number <= (Math.pow(2, 63) - 1)){
            System.out.println("* long");
        }
    }
}
