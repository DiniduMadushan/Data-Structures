
package LinkedListApp;


class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Add a new element to the end of the list
    public void add(char data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Move a specific element to the first position
    public void moveToFirst(char data) {
        if (head == null || head.data == data) {
            return;
        }
        Node prev = null;
        Node current = head;
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }
        if (prev != null) {
            prev.next = current.next;
        }
        current.next = head;
        head = current;
    }

    // Move a specific element to the last position
    public void moveToLast(char data) {
        if (head == null || head.next == null) {
            return;
        }
        Node prev = null;
        Node current = head;
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }
        if (current == null || current.next == null) {
            return;
        }
        if (prev != null) {
            prev.next = current.next;
        } else {
            head = current.next;
        }
        Node tail = current;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = current;
        current.next = null;
    }

    // Make a specific element the second element
    public void moveToSecond(char data) {
        if (head == null || head.next == null || head.data == data) {
            return;
        }
        Node prev = null;
        Node current = head;
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }
        if (prev != null) {
            prev.next = current.next;
        }
        current.next = head.next;
        head.next = current;
    }

    // Remove a specific element from the list
    public void remove(char data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node prev = null;
        Node current = head;
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }
        prev.next = current.next;
    }
}

public class LinkdListOperations {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // i. Add A,B,C,D,E to the list
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        System.out.print("After adding A, B, C, D, E: ");
        list.printList();  // Output: A B C D E

        // ii. Make “C” as the first element and “D” as the last element
        list.moveToFirst('C');
        list.moveToLast('D');
        System.out.print("After moving C to first and D to last: ");
        list.printList();  // Output: C A B E D

        // iii. Make “E” as the second element
        list.moveToSecond('E');
        System.out.print("After moving E to second: ");
        list.printList();  // Output: C E A B D

        // iv. Print the list
        System.out.print("Print the list: ");
        list.printList();  // Output: C E A B D

        // v. Remove “B” from the list
        list.remove('B');
        System.out.print("After removing B: ");
        list.printList();  // Output: C E A D

        // vi. Print the list after removal
        System.out.print("Print the list after removal: ");
        list.printList();  // Output: C E A D
    }
}

