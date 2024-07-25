
package Arrays;

import java.util.Scanner;
public class InsertArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int arr[] = new int[size+1];
        System.out.println("Enter the "+size+ " Elements :");
        
        for(int x=0;x<size;x++){
            arr[x] = scan.nextInt();
        }
        
        System.out.println("The array is:");
        for(int x=0;x<size;x++){
            System.out.println("Element "+(x+1)+" : "+arr[x]);
        }
        
        System.out.print("Enter the new element you want to insert:");
        int ele = scan.nextInt();
        arr[size] = ele;
        
        System.out.println("The new array is:");
        for(int x=0;x<arr.length;x++){
            
            System.out.println(arr[x]+",");
        }
        
    }
}
