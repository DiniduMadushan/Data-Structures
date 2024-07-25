
package Queue;


public class ArrayQueue {
    private int front,rear,capacity,currentSize;
    private int queueArray[];
    
    public ArrayQueue(int capacity){
        this.capacity = capacity;
        this.currentSize = 0;
        this.front = -1;
        this.rear = -1;
        this.queueArray = new int[this.capacity];
    }
    
    public boolean isEmpty(){
        return (front == -1 && rear == -1);
    }
    
    public boolean isFull(){
        return (currentSize == capacity);
    }
    
    public void enqueue(int num){
        if(isFull()){
            System.out.println("Cannot add elements.queue is full");
        }else{
            if(isEmpty()){
                front++;
                rear++;
                currentSize++;
                queueArray[front] = num;
                queueArray[rear] = num;
                System.out.println(num+" is added to the queue.");
                
            }else{
                rear++;
                queueArray[rear] = num;
                currentSize++;
                System.out.println(num+" is added to the queue.");
            }
        }
    }
    
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty. cannot dequeue.");
        }else{
            if(rear==front){
                rear = front =-1;
            }else{
                System.out.println(queueArray[front++]+" removed from the queue.");
                currentSize--;
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(4);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.enqueue(10);
        System.out.println("Current size is: "+queue.currentSize);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        System.out.println("Current size is: "+queue.currentSize);
    }
}
