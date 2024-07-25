
package Stack;

import java.util.Scanner;
import java.util.Stack;

public class RevLines {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        
        String sentences[] = new String[3];
        
        System.out.println("Enter your sentences:\n");
        
        for(int x=0;x<sentences.length;x++){
            sentences[x] = scan.nextLine();
        }
        
        for(String sentence:sentences){
            stack.push(sentence);
        }
        
         System.out.println("Reversed lines are as follows:\n");
        
        for(int x=0;x<sentences.length;x++){
            System.out.println(stack.pop());
        }
        
    }
}
