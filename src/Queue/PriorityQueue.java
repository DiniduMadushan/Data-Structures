package Queue;

public class PriorityQueue {

    private int[] queue;
    private int maxSize;
    private int size;

    public PriorityQueue(int capacity) {
        maxSize = capacity;
        queue = new int[maxSize];
        size = 0;
    }
    
    public boolean isEmpty(){
        return size ==0;
    }
    
    public boolean isFull(){
        return size == maxSize;
    }
    
    public void insert(int item){
        if(isFull()){
            System.out.println("Priority queue is full.cannot insert items");
            return;
        }
        if(isEmpty()){
            queue[size++] = item;
        }else{
            int i;
            for(i=size-1;i>=0;i--){
                if(item>queue[i]){
                    queue[i+1] =queue[i];
                }else{
                    break;
                }
            }
            queue[i+1] = item;
            size++;
        }
    }
    
    public int remove(){
        if(isEmpty()){
            System.out.println("Priority queue is empty.cannot remove");
            return -1;
        }
        
        return queue[--size];
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        System.out.println("Priority queue: ");
        for(int i=0;i<size;i++){
            System.out.println(queue[i] +" ");
        }
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(5);
        
        pq.insert(3);
        pq.insert(12);
        pq.insert(28);
        pq.insert(7);
        
        pq.display();
        
        System.out.println("\n\nRemoving items from the queue:");
        
        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}
