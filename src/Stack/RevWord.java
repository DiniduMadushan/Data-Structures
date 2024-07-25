package Stack;

import java.util.Scanner;
import java.util.Stack;

public class RevWord {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the word to reverse:");
        String word = scan.nextLine();

        char arr[] = word.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char ch : arr) {
            stack.push(ch);
        }

        StringBuilder rev_word = new StringBuilder();
        
        while(!stack.isEmpty()){
            rev_word.append(stack.pop());
        }
        
        System.out.println("Reversed word is: "+rev_word);

    }
}
