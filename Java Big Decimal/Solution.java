import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution{
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        int numberOfInput = scanner.nextInt();
        String [] inputStringArray = new String [numberOfInput];
        
        for(int index = 0; index < inputStringArray.length ; index++){
            inputStringArray[index] = scanner.next();
        }

        scanner.close();

        //Write your code here

        Comparator<String> customComparator = new Comparator<String>() {
            @Override
                public int compare(String number1, String number2) {
                    BigDecimal bigDecimal1 = new BigDecimal(number1);
                    BigDecimal bigDecimal2 = new BigDecimal(number2);
                    return bigDecimal2.compareTo(bigDecimal1);
                }
        };
        
        Arrays.sort(inputStringArray, 0, numberOfInput, customComparator); 

        /**
         * 
         * This is an implementation using manually with QuickSort.
         * 
         **/
        
        //quickSort(inputStringArray, 0, inputStringArray.length-1);
        

        //Output
        for (String bigDecimal : inputStringArray){
            System.out.println(bigDecimal);
        }
    }

    private static void quickSort(String[] inputArray, int start, int end){

        if (end <= start) return; //base case

        int pivot = partition(inputArray, start, end);
        quickSort(inputArray, start, pivot - 1);
        quickSort(inputArray, pivot + 1, end);
    }

    private static int partition(String[] inputArray, int start, int end){
        
        BigDecimal pivot = new BigDecimal(inputArray[end]);

        int i = start - 1;

        for(int j = start; j <= end; j++){
            BigDecimal convertedJValue = new BigDecimal(inputArray[j]);
 
            if(convertedJValue.compareTo(pivot) < 0){
                i++;
                String temp = inputArray[j];
                inputArray[j] = inputArray[i];
                inputArray[i] = temp; 
            }
        }

        i++;
        String temp = inputArray[end];
        inputArray[end] = inputArray[i];
        inputArray[i] = temp; 
        
        return i;
    }
}
