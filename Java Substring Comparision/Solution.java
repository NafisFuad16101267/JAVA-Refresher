import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        for(int index = 0; index <= s.length() - k; index++){
            // here we have used '<=' because java substring() method ending index is not inclusive/ exclusive

            if(smallest.isEmpty() && largest.isEmpty()){
                smallest = s.substring(index, index + k);
                largest = s.substring(index, index + k);
            } else {
                String tempSubString = s.substring(index, index + k);

                if(tempSubString.compareTo(smallest) < 0){
                    smallest = tempSubString;
                }

                if(tempSubString.compareTo(largest) > 0){
                    largest = tempSubString;
                }
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
