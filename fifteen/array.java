package fifteen;
public class array {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
//Linear search
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String args[]) {
        int numbers[] = { 10, 20, 30, 40, 50 };
        int key = 200;
        int index = linearSearch(numbers, key);

        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("found");
        }

        // int marks[] = { 80, 90, 95 };
        // update(marks);

        // //print marks
        // for (int i = 0; i < marks.length; i++) {
        //     System.out.print(marks[i] + " ");
        // }
        // System.out.println();
    }
}
