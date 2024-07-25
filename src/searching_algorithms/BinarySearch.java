
package searching_algorithms;


public class BinarySearch {
    public static int binarySearch(int arr[], int L, int R, int data){
        if(R >= L){
            
            int mid = (L+R)/2;
            
            if(arr[mid] == data){
                return mid;
            }
            
            if(arr[mid] > data){
               return binarySearch(arr, L, mid-1, data);
            }else{
                return binarySearch(arr, mid+1, R, data);
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {12,55,34,88,96};
        
        int size = arr.length;
        int data = 99;
        
        int result = binarySearch(arr, 0, size-1, data);
        
        if(result == -1){
            System.out.println("Element is not found!");
        }else{
            System.out.println("Element is found at index: "+result);
        }
        
    }
    
}
