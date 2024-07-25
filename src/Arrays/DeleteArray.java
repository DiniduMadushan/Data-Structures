
package Arrays;

import java.util.Scanner;


public class DeleteArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int len = scan.nextInt();
        int arr[] = new int[len];

        System.out.println("Enter the Elements:");
        for (int x = 0; x < len; x++) {
            arr[x] = scan.nextInt();
        }

        System.out.println("The array is:");
        for (int x = 0; x < len; x++) {
            System.out.println("Element " + (x + 1) + " : " + arr[x]);
        }
        
        System.out.println("Enter the position of the element to be removed");
        int pos = scan.nextInt();
        
        for(int x = pos;x<len-1;x++){
            arr[x] =arr[x+1];
        }
        
        len =len-1;
        
        System.out.println("After deleting new array is: ");
        
        for(int x=0;x<len;x++){
            System.out.println(arr[x]+",");
        }
    }
}
