
package sorting_algorithms;


public class MergeSort {
    
       public static void merge(int[] array, int lb, int mid, int ub) {
        int n1 = mid - lb + 1;
        int n2 = ub - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = array[lb + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0, k = lb;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
       
           public static void mergeSort(int[] array, int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;

            mergeSort(array, lb, mid);
            mergeSort(array, mid + 1, ub);

            merge(array, lb, mid, ub);
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 6, 7, 8, 10, 2, 9, 11, 13, 12};

        System.out.println("Before sorting:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After sorting:");
        printArray(arr);
    }

 



    
}
