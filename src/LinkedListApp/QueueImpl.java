package LinkedListApp;

//node class
class Node {

    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

//queue class

class Queue {
    Node front;
    Node rear;

    Queue() {
        this.front = null;
        this.rear = null;
    }

    // Method to insert an element into the queue
    public void enqueue(char data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Method to delete an element from the queue
    public char dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return '\0';
        }
        char data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    // Method to display the elements of the queue
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}


public class QueueImpl {
  public static void main(String[] args) {
        Queue queue = new Queue();
        
        // i. Insert A, B and then C
        queue.enqueue('A');
        queue.enqueue('B');
        queue.enqueue('C');
        System.out.print("Queue after inserting A, B, C: ");
        queue.display();  // Output: A B C 
        
        // ii. Delete an element
        queue.dequeue();
        System.out.print("Queue after deleting an element: ");
        queue.display();  // Output: B C
        
        // iii. Insert D and then E
        queue.enqueue('D');
        queue.enqueue('E');
        System.out.print("Queue after inserting D, E: ");
        queue.display();  // Output: B C D E
        
        // iv. Delete two elements
        queue.dequeue();
        queue.dequeue();
        System.out.print("Queue after deleting two elements: ");
        queue.display();  // Output: D E
        
        // v. Insert F
        queue.enqueue('F');
        System.out.print("Queue after inserting F: ");
        queue.display();  // Output: D E F
    }
}
