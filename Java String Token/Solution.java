import java.util.Scanner;

public class Solution{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        inputString = inputString.trim();

        if(inputString.length() == 0){
            System.out.println(0);
            return;
        }

        String[] splitedTokenArray =  inputString.split("[ !,?._'@]+");
        
        System.out.println(splitedTokenArray.length);

        for (String token : splitedTokenArray) {
            System.out.println(token);
        }

        sc.close();
    }
}