
package LinkedListApp;


// Node class to represent each element in the stack
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Stack class using linked list
class Stack {
    private Node top;
    private int size;

    public Stack() {
        top = null;
        size = 0;
    }

    // Push operation to add an element to the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Pop operation to remove and return the top element of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // Peek operation to return the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Return the size of the stack
    public int size() {
        return size;
    }

    // Print the stack elements
    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Main class to demonstrate stack operations
public class StackImpl {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // Push elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.print("Stack after pushing 10, 20, 30: ");
        stack.printStack();  // Output: 30 20 10

        // Pop an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);  // Output: 30
        System.out.print("Stack after popping an element: ");
        stack.printStack();  // Output: 20 10

        // Peek the top element of the stack
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);  // Output: 20

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);  // Output: false

        // Get the size of the stack
        int stackSize = stack.size();
        System.out.println("Stack size: " + stackSize);  // Output: 2
    }
}
