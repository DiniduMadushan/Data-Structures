
package Stack;


public class ArrayStack {
    private int stackArr[];
    private int maxSize;
    private int top;
    
    public ArrayStack(int size){
        this.maxSize = size;
        this.stackArr = new int[maxSize];
        this.top = -1;
    }
    
    public boolean isEmpty(){
       return (top == -1);
    }
    
    public boolean isFull(){
        return (top == maxSize-1);
    }
    
    public void push(int num){
        if(isFull()){
            System.out.println("Stack is full.cannot insert elements.");
        }else{
            stackArr[++top] = num;
            System.out.println("Element is added.");
        }
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty.no elements to remove.");
            return 0;
        }else{
            return stackArr[top--];
        }
        
    }
    
    public int size(){
        return (top+1);
    }
    
    public int top(){
        if(isEmpty()){
            System.out.println("Empty stack.");
            return 0;
        }else{
          return stackArr[top];  
        }
        
    }
    
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(4);
        stack.push(6);
        stack.push(9);
        stack.push(2);
        stack.push(4);
        System.out.println("top element is: "+stack.top());
        System.out.println(stack.pop()+" is removed");
    }
}
