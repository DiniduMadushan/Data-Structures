

package sorting_algorithms;

public class BubbleSort {
    
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
            }
        }
    }
    
    public static void displayArray(int arr[]){
        for(int element:arr){
            System.out.print(element + " ");
        }
        
            System.out.println("\n");
    }
    
    public static void main(String[] args) {
       int arr[] ={12,4,22,87,53};
       
        System.out.println("Before sorting: ");
        displayArray(arr);
        
        // call the sorting function
        bubbleSort(arr);
        
        System.out.println("After sorting");
        displayArray(arr);
    }
}
