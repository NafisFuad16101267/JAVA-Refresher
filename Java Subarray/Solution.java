import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        
        int[] inputArray = new int[arrayLength];

        for(int index = 0; index < arrayLength; index++){
            inputArray[index] = scanner.nextInt();
        }

        scanner.close();

        int negativeSumCount = 0;

        for (int index2 =0; index2 < arrayLength; index2++) {
            int sum = 0;
            for (int index3 = index2; index3 < arrayLength; index3++) {
                sum += inputArray[index3];
                if (sum < 0) negativeSumCount++;
            }
        }
        
        System.out.println(negativeSumCount);
    }
}