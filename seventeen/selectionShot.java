package seventeen;

public class selectionShot {
    public static void selectShot(int nums[]) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[minpos] > nums[j]) {
                    minpos = j;
                }
            }
            //swap
            int temp = nums[minpos];
            nums[minpos] = nums[i];
            nums[i] = temp;
        }

    }

 
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int nums[] = { 5, 4, 1, 3, 2 };
        selectShot(nums);
        printArr(nums);

    }
}
  