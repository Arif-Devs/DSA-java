package TwentyTwo_Recursion;

public class decreseOrder {
    public static void prtDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        prtDec(n - 1);

    }

    public static void prntdec(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        prntdec(n - 1);
        System.out.print(n + " ");
    }
    
    //factorial of n
    public static int factorial(int n) {
        if (n == 1) {

            return 1;
        } else {

            return n * factorial(n - 1);
        }
    }
    
    //Check sorted array
    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    //First occurrence
    public static int fo(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return fo(arr, key, i + 1);
    }
    
     //Last occurrence
     public static int lo(int arr[], int key, int i) {
         if (i == arr.length) {
             return -1;
         }
         int isFound = lo(arr, key, i + 1);
         if (isFound != -1) {
             return isFound;
         }

         if (arr[i] == key) {
             return i;
         }
         return isFound;

     }

    public static void main(String args[]){
        //int n = 10;
       // prtDec(n);
       //prntdec(n);
       //int arr[] = { 1, 2, 3, 4, 5 };
       //System.out.println(isSorted(arr, 0));
       int arr[] = { 8, 3, 6, 9, 5, 10, 2, 10, 3 };
       //System.out.println(fo(arr, 10, 0));
       //System.out.println(lo(arr, 10, 0));
       
       //System.out.println(factorial(5));
    }
};
