
package LinkedList;


public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(12);
        list.insert(19);
        list.insert(52);
        list.insertAtStart(22);
        list.insertAt(2,30);
        list.deleteAt(2);
        list.find(99);
        
        list.show();
        
    }
}
