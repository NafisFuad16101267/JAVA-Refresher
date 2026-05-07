import java.util.*;

public class Solution {
 public static void main(String[] args) {

  try {
   Scanner in = new Scanner(System.in);
   int inputNumber = in .nextInt();
   in.close();
   

   String convertedString = Integer.toString(inputNumber);

   
   if (inputNumber == Integer.parseInt(convertedString)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  } catch (Exception e) {
   System.out.println("Unsuccessful Termination!!");
  }
 }
}
