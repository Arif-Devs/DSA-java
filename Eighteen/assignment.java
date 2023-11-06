package Eighteen;



public class assignment {

    //assignment 01
    public static int searchCount(int[][] arr) {
        int count = 0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == 7) {
                    count++;
                }
            }
        }

        return count;
    }
    //assignment 02
    public static int getSumOfRow(int arr[][]) {
        int sum = 0;
        int arr1[] = arr[1];

        for (int i = 0; i < arr.length; i++) {
            sum += arr1[i];
        }
        return sum;
    }
    
    //assignment 03

    public static int [][]getTransport(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int ans[][] = new int[m][n];
        
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = arr[j][i];
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        //int [][] arr= { { 4, 7, 8 }, { 8, 8, 7 } }; //assignment 01
        //int arr[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } }; //assignment 02
        //System.out.println(getSumOfRow(arr));

        int arr[][] = { { 4, 9, 10 }, { 5, 7, 11 } };

        int ans[][] = getTransport(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    };
    
}
