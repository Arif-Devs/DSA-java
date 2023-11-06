package daySixteen;

public class assign02 {
    public static int Search(int numbers[], int target) {
        int start = 0;
        int end = numbers.length -1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == target) {
                return mid;
            }
            if (numbers[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String args[]) {
        int numbers[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 2;
        System.out.println(Search(numbers, target));
    }
}
