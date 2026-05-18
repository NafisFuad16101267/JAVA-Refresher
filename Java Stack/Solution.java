import java.util.Scanner;
import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(isBalanced(input));
        }
    }

    private static boolean isBalanced(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {

        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}