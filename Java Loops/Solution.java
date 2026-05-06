import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution{
    public static void main(String[] args) {
        try{
            //javaLoopsPracticeOne();
            javaLoopsPracticeTwo();
        }
        catch(IOException e){
            System.out.println("An IO exception occured: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("An error occured: " + e.getMessage());
        }
    }

    public static void javaLoopsPracticeOne() throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine().trim());

        for(int index = 1; index <= 10; index++) {
            System.out.println(number + " x " + index + " = " + number * index);
        }

        bufferedReader.close();
    }

    public static void javaLoopsPracticeTwo() throws IOException{
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

        int numberOfInputLines = Integer.parseInt(bufferReader.readLine().trim());

        while(numberOfInputLines > 0){
            String inputStream = bufferReader.readLine().trim();

            String inputStringArray[] = inputStream.split(" ");

            int[] inputNumberArray = new int[3];

            for(int index = 0; index <inputStringArray.length; index++){
                inputNumberArray[index] = Integer.parseInt(inputStringArray[index]);
            }

            int a = inputNumberArray[0];
            int b = inputNumberArray[1];
            int n = inputNumberArray[2];

            int sum = 0;

            for(int step = 0; step < n; step++){

                if(step == 0){
                    sum += a;
                }

                sum += (int)Math.pow(2, step) * b;
                System.out.print(sum + " ");

                if(step == n-1){
                    System.out.println();
                }
            }

            numberOfInputLines--;
        }
    }
}