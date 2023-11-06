package twentyFour;
// Question 1 : Apply Merge sort to sort an array of Strings. (Assume that all the characters in
// all the Strings are in lowercase). (EASY)
// Sample Input 1 : arr = { "sun", "earth", "mars", "mercury" }
// Sample Output 1 : arr = { "earth", "mars", "mercury", "sun"
public class assign_q1 {
    public static boolean smaller(String a, String b) {
        for (int idx = 0; idx < Math.min(a.length(), b.length()); idx++) {
            if (a.charAt(idx) < b.charAt(idx)) {
                return true;
            } else if (a.charAt(idx) > b.charAt(idx)) {
                return false;
            }
        }
        if (a.length() < b.length())
            return true;
        else
            return false;
    }

    public static void marge(String arr[], int startIndex, int mid, int endIndex) {
        String[] temp = new String[endIndex - startIndex + 1];
        int i = startIndex;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= endIndex) {
            if (smaller(arr[i], arr[j]) == true) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }
        while (j <= endIndex) {
            temp[k] = arr[i];
            k++;
            j++;
        }

        for (int idx = startIndex; idx <= endIndex; idx++) {
            arr[idx] = temp[idx - startIndex];
        }

    }

    public static void margeShot(String[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }
        int mid = startIndex + (endIndex - startIndex) / 2;
        margeShot(arr, startIndex, mid );
        margeShot(arr, mid + 1, endIndex);
        marge(arr, startIndex, mid, endIndex);
    } 
    
     public static void main(String args[]) {
         String arr[] = { "sun", "earth", "mars", "mercury" };
         margeShot(arr, 0, arr.length - 1);
         
         for (int idx = 0; idx<arr.length; idx++) {
             System.out.print(arr[idx] + " ");
         }
     }
 }
   
   
   
   
   
   
