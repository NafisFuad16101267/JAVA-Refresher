import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class Solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int listSize = Integer.parseInt(scanner.nextLine());

        String listElement = scanner.nextLine();

        String[] elementArray = listElement.split(" ");

        List<Integer> intList = new LinkedList<>();

        for(int listIndex = 0; listIndex < listSize; listIndex++){
            int listItem = Integer.parseInt(elementArray[listIndex]);
            intList.add(listItem);
        }

        int numberOfQuery = Integer.parseInt(scanner.nextLine());

        for(int index = 0; index < numberOfQuery; index++){
            String command = scanner.nextLine();
            if(command.equals("Insert")){
                String insertPosAndEle = scanner.nextLine();
                String[] insertPosAndEleArr = insertPosAndEle.split(" ");
                int position = Integer.parseInt(insertPosAndEleArr[0]);
                int element = Integer.parseInt(insertPosAndEleArr[1]);
                intList.add(position, element);
            } else if(command.equals("Delete")){
                int position = Integer.parseInt(scanner.nextLine());
                intList.remove(position);
            }
        }

        for(int element : intList){
            System.out.print(element + " ");
        }
    }
}