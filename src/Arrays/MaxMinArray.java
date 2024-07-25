
package Arrays;


public class MaxMinArray {
      public static void main(String[] args) {
        int num[] = {12, 23, 35, 4, 5};
        int max = num[0];
        int min = num[0];
        for (int x=0;x<num.length;x++) {
            if (num[x] > max) {
                max = num[x];
            }
            if (num[x]< min) {
                min = num[x];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
