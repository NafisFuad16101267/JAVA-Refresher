import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int numberOfElement = Integer.parseInt(scanner.nextLine());

        Map<String,Integer> contactInfoMap = new HashMap<String, Integer>();

        for(int index = 0; index < numberOfElement; index++){
            String name = scanner.nextLine();
            int phoneNumber = Integer.parseInt(scanner.nextLine());
            contactInfoMap.put(name, phoneNumber);
        }

        while(scanner.hasNext()){
            String qureyName = scanner.nextLine();
            if(contactInfoMap.containsKey(qureyName)){
                int phoneNumber = contactInfoMap.get(qureyName);
                System.out.println(qureyName + "=" + phoneNumber);
            } else {
                System.out.println("Not found");
            }
        }
    }
}