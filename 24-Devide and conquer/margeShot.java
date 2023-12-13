

public class margeShot {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void margeshot(int arr[], int startIndex, int endIndex) {
        //Base Case
        if (startIndex >= endIndex) {
            return;
        }

        int mid = (startIndex + endIndex) / 2; //mid
        margeshot(arr, startIndex, mid); // left side
        margeshot(arr, mid + 1, endIndex); // right side
        marge(arr, startIndex, mid, endIndex);
    }
    // Iterator Function
    public static void marge(int arr[], int startIndex, int mid, int endIndex) {
        int temp[] = new int[endIndex - startIndex + 1];
        int i = startIndex;
        int j = mid+1;
        int k = 0;
        while (i <= mid && j <= endIndex) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
       
        //for leftover elements of 1st sorted part
        while (i <= mid) {
            temp[k++] = arr[i++];
       
        //for leftover elements of 2st sorted part
        }
        while (j <= endIndex) {
            temp[k++] = arr[j++];
        }
      
        //Copy from temp to original arr
        for (k = 0, i = startIndex; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
            

    }
    
    
    public static void main(String args[]) {
        int arr[] = { 1, 3, 9, 5, 2, 8 };
        margeshot(arr, 0, arr.length - 1);
        printArr(arr);
    }

}
