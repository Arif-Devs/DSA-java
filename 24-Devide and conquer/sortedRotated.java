

public class sortedRotated {
   

    public static int search(int arr[], int target, int startIndex, int endIndex) {
        //Base case
        if (startIndex > endIndex) {
            return -1;
        }

        //calculate mid
        int mid = startIndex + (endIndex - startIndex) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (startIndex <= arr[mid]) {
            //case a: left
            if (arr[startIndex] <= target && arr[mid] >= target) {
                return search(arr, target, startIndex, mid - 1);
            } else {
                //case b: right
                return search(arr, target, mid + 1, endIndex);
            }
        } else {
            //case c: right
            if (arr[mid] <= target && target <= endIndex) {
                return search(arr, target, mid+1, endIndex);
            } else {
               return search(arr, target, startIndex, mid - 1);
            }
        }

   }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 6;
        int tarIndex = search(arr, target, 0, arr.length - 1);
        System.out.println(tarIndex);

    }
}
