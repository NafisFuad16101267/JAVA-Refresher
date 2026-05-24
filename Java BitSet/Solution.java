import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenghtOfBitSet = scanner.nextInt();
        int numberOfOperation = scanner.nextInt();
        
        BitSet bitSetArray[] = new BitSet[2];
        bitSetArray[0] = new BitSet(lenghtOfBitSet);
        bitSetArray[1] = new BitSet(lenghtOfBitSet);
        scanner.nextLine();
        
        for(int index = 0 ; index < numberOfOperation ; index++) {
            String inputString = scanner.nextLine();
            
            String input[] = inputString.split(" ");
            String command = input[0];
            int a = Integer.parseInt(input[1]);
            int b = Integer.parseInt(input[2]);
            
            if(command.equals("AND")) {
                bitSetArray[a-1].and(bitSetArray[b-1]);
            }else if(command.equals("OR")) {
                bitSetArray[a-1].or(bitSetArray[b-1]);
            }
            else if(command.equals("XOR")) {
                bitSetArray[a-1].xor(bitSetArray[b-1]);
            }else if(command.equals("FLIP")) {
                boolean flag = bitSetArray[a-1].get(b);
                bitSetArray[a-1].set(b, !flag);
            }else if(command.equals("SET")) {
                bitSetArray[a-1].set(b, true);
            }
            System.out.println(bitSetArray[0].cardinality()+" "+bitSetArray[1].cardinality());
        }
    }
}
