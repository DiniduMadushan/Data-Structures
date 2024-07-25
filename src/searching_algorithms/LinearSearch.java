

package searching_algorithms;

public class LinearSearch {
    public static int linearSearch(int arr[], int data){
        int size = arr.length;
        for(int i=0;i<size;i++){
            if(arr[i] == data){
                return i;
            }
        }
        
        return -1;
    }
    
    public static void main(String args[]){
        int arr[] = {11,23,14,56,87};
        int data = 14;
        
        int result= linearSearch(arr, data);
        if(result == -1){
            System.out.println("Serached element is not found!");
        }else{
            System.out.println("searched element is found at index: "+result);
        }
    }
}
