package twentyFour;

public class quickSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void qsort(int arr[], int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int pivotIndex = partition(arr, startIndex, endIndex);
        qsort(arr, startIndex, pivotIndex - 1); //left
        qsort(arr, pivotIndex + 1, endIndex); //right
    }
    
    
    public static int partition(int arr[], int startIndex, int endIndex) {
        int pivot = arr[endIndex];
        int i = startIndex - 1;

        for (int j = startIndex; j < endIndex; j++) {
            if (arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[endIndex] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        qsort(arr, 0, arr.length - 1);
        printArr(arr);
    }

}
