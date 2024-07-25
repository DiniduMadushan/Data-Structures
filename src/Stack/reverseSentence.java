
package Stack;

import java.util.Scanner;
import java.util.Stack;

public class reverseSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your sentence:");
        String sentence = scan.nextLine();
        
        String words[] = sentence.split(" ");
        
        Stack<String> stack = new Stack<>();
        
        for(String word:words){
            stack.push(word);
        }
        
        StringBuilder rev_sentence = new StringBuilder();
        
        while(!stack.isEmpty()){
            rev_sentence.append(stack.pop()).append("");
        }
        
        System.out.println("Reveresed sentence is :"+rev_sentence);
    }
}
