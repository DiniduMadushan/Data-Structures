package sorting_algorithms;


public class QuickSort{
    
    public static int partition(int arr[], int lb, int ub){
        
        int pivot = arr[lb];
        int start = lb+1;
        int end = ub;
        
        while(true){
            while(start <= end && arr[start] <= pivot){
                start++;
            }
            
            while(start <= end && arr[end] > pivot){
                end--;
            }
            
            if(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }else{
                break;
            }
        }
        
        int temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;
        
        return end;
    }
    
    public static void quickSort(int arr[], int start, int end){
        if(start >= end){
            return;
        }
        
        int k =partition(arr, start, end);
        quickSort(arr,start ,k-1);
        quickSort(arr, k+1, end);
    } 
    
    public static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
    
    
    public static void main(String[] args) {
        int arr[] = {12,45,32,5,87,54};
        int lb = 0;
        int ub = arr.length - 1;
        
        System.out.println("Before sorting:");
        printArray(arr);
        
        //call sorting algorithm
        quickSort(arr, lb, ub);
        
        System.out.println("After sorting:");
        printArray(arr);
    }
}


