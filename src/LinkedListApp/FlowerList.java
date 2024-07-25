package LinkedListApp;

import java.util.*;

public class FlowerList {

    public static void main(String args[]) {
        LinkedList<String> flowers = new LinkedList<>();

        flowers.add("Rose");
        flowers.add("Lilly");
        flowers.add("Anthurium");
        flowers.add("abc");
        flowers.add("def");
        flowers.add("ghi");

        System.out.println("Linked list is: " + flowers);

        //iterating linked List
        Iterator<String> iterator1 = flowers.iterator();

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next() + " is a flower");
        }

        //removing elements
        flowers.removeFirst();
        flowers.removeLast();
        flowers.remove(2);
        flowers.remove("def");

        System.out.println("\nAfter removing elements");

        Iterator iterator2 = flowers.iterator();

        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        flowers.add("Rrrr");
        flowers.add("Lllll");
        flowers.add("Aaaaaa");

        System.out.println("\n\n After adding: " + flowers);

        //finding elements in the list
        boolean status = flowers.contains("Lilly");
        if (status) {
            System.out.println("\nList contain the searched value");
        } else {
            System.out.println("List does not contain the searched value");
        }

        //number of elements
        int size = flowers.size();
        System.out.println("size of the list is: "+size);
        
        //get and set elements
        Object flower = flowers.get(2);
        System.out.println("Element at the index 2 is:"+flower);
        
        flowers.set(2, "Flower1");
        System.out.println("Ater inserting element: "+flowers);
        
        //iteraing through the list using for loop
        System.out.println("\n\nIterating using for loop");
        
        for(int x=0;x<flowers.size();x++){
            System.out.println(flowers.get(x) +" "); 
       }
    }
}
