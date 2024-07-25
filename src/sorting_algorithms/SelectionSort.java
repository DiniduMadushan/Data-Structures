
package sorting_algorithms;


public class SelectionSort {
    
    public static void selectionSort(int arr[]){
        int n= arr.length;
        
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j = i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
     public static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        int arr[] = {12,45,3,89,76};
        System.out.println("Before sorting:");
        printArray(arr);
        
        //call the sorting function
        selectionSort(arr);
        
        System.out.println("After sorting the array:");
        printArray(arr);
    }
}
