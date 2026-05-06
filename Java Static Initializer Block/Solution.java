import java.util.Scanner;

public class Solution {

    public static Scanner sc = new Scanner(System.in);
    public static int breadth;
    public static int height;
    public static boolean validValue = true;


    static{
        try{
            breadth = sc.nextInt();
            height = sc.nextInt();

            if(breadth <= 0 || height <= 0){
                validValue = false;
                throw new Exception ("Breadth and height must be positive");
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args){        
        if(validValue){
            System.out.println(breadth * height);
        }
    }    
}
