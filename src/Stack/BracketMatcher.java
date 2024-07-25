
package Stack;
import java.util.Scanner;
import java.util.Stack;

public class BracketMatcher {

    // Method to check if the brackets are correctly matched
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the expression
        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                // Push opening brackets onto the stack
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                // Check if the stack is empty (no matching opening bracket)
                if (stack.isEmpty()) {
                    return false;
                }
                // Pop from the stack and check if it matches the current closing bracket
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }
        
        // If stack is empty, all brackets were matched
        return stack.isEmpty();
    }

    // Helper method to check if two brackets form a matching pair
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String expression = scanner.nextLine();
        
        if (isBalanced(expression)) {
            System.out.println("The expression has matching brackets.");
        } else {
            System.out.println("The expression does not have matching brackets.");
        }
    }
}

