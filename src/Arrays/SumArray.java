
package Arrays;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int arr[] = {12,45,11,33};
       int sum=0;
       
      for(int x=0;x<arr.length;x++){
          sum=sum+arr[x];
      }
      
        System.out.println("The sum of the given array is: "+sum);
    }
            
}
