import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInput = scanner.nextInt();
        int subArraySize = scanner.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxUnique = 0;
        int subArrayCount = 0;

        for (int index = 0; index < numberOfInput; index++) {
            int inputNumber = scanner.nextInt();

            deque.addLast(inputNumber);
            
            if(!map.containsKey(inputNumber))
                map.put(inputNumber, 1);
            else
                map.replace(inputNumber, map.get(inputNumber) + 1);

            subArrayCount++;

            if(subArrayCount == subArraySize){
                int uniqueNumber = map.size();
                maxUnique = (uniqueNumber > maxUnique)? uniqueNumber : maxUnique;
                
                int removedNumber = deque.removeFirst();
                
                if(map.get(removedNumber) == 1)
                    map.remove(removedNumber);
                else
                    map.replace(removedNumber, map.get(removedNumber) - 1);
                
                subArrayCount--;
            }

        }

        scanner.close();

        System.out.println(maxUnique);
    }
}