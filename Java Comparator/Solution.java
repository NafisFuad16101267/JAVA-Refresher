import java.util.Scanner;
import java.util.Arrays;

public class Solution{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = scanner.nextInt();
        Player[] playerArray = new Player[numberOfInputs];
        Checker checker = new Checker();

        for(int index = 0; index < numberOfInputs; index++){
            String playerName = scanner.next();
            int playerScore = scanner.nextInt();
            playerArray[index] = new Player(playerName, playerScore);
        }

        scanner.close();

        Arrays.sort(playerArray, checker);

        for(Player player : playerArray){
            System.out.printf("%s %s\n", player.name, player.score);
        }
    }
}