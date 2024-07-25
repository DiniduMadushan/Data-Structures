
package Arrays;


public class AverageArray {
    public static void main(String[] args) {
        int arr[] = {33,12,44,22};
        int sum=0;
        
//        for(int num:arr){
//            sum=sum+num;
//        }

         for(int x=0;x<arr.length;x++){
             sum=sum+arr[x];
         }
         
         double average= (double)sum/arr.length;
         System.out.println("The average value is: "+average);
    }
}
