
package sorting_algorithms;


public class InsertionSort {
    
    public static void insertionSort(int arr[]){
        
        int n = arr.length;
        
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            
            arr[j+1] = key;
            
        }
    }
    
    public static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    
    
    public static void main(String[] args) {
        int nums[] = {2,4,8,1,5,11,22,6};
        
        System.out.println("Before sorting the array is: ");
        printArray(nums);
        
        //insertion sort function call
        insertionSort(nums);
        
        
        System.out.println("\n\nAfter sorting the array is: ");
        printArray(nums);
    }
}
