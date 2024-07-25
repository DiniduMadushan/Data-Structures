
package Stack;

import java.util.Scanner;

public class ArrStackRevSen {
    private String stackArr[];
    private int maxSize;
    private int top;
    
    public ArrStackRevSen(int size){
        this.maxSize = size;
        this.stackArr = new String[maxSize];
        this.top = -1;
    }
    
    public boolean isEmpty(){
       return (top == -1);
    }
    
    public boolean isFull(){
        return (top == maxSize-1);
    }
    
    public void push(String word){
        if(isFull()){
            System.out.println("Stack is full.cannot insert words.");
        }else{
            stackArr[++top] = word;
        }
    }
    
    public String pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty.no elements to remove.");
            return null;
        }else{
            return stackArr[top--];
        }
        
    }
    
 
    public static void main(String[] args) {
        ArrStackRevSen stack = new ArrStackRevSen(30);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your sentence:");
        String sentence = scan.nextLine();
        
        String words[] = sentence.split(" ");
        
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
