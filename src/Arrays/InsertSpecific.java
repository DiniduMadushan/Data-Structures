package Arrays;

import java.util.Scanner;

public class InsertSpecific {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int len = scan.nextInt();
        int arr[] = new int[len + 1];

        System.out.println("Enter the Elements:");
        for (int x = 0; x < len; x++) {
            arr[x] = scan.nextInt();
        }

        System.out.println("The array is:");
        for (int x = 0; x < len; x++) {
            System.out.println("Element " + (x + 1) + " : " + arr[x]);
        }
        
        System.out.print("Enter the element to insert: ");
        int e = scan.nextInt();
        
        System.out.print("Enter the position to insert: ");
        int p = scan.nextInt();

        // Ensure position is valid
        if (p < 1 || p > len + 1) {
            System.out.println("Invalid position! Please enter a position between 1 and " + (len + 1));
            return;
        }
        
        // Shift elements to the right from the specified position
        for(int x = len; x >= p; x--) {
            arr[x] = arr[x - 1]; 
        }
        
        arr[p - 1] = e;
        
        System.out.println("After Inserting: ");
        for(int x = 0; x <= len; x++) {
            System.out.print(arr[x]);
            if(x < len) {
                System.out.print(", ");
            }
        }
    }
}
