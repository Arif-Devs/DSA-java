package twentyThree;
//Question 1 : For a given integer array of size N. You have to find all the occurrences
// (indices) of a given element (Key) and print them. Use a recursive function to solve this
// problem.
// Sample Input : arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
// Sample Output : 1 5 7 8
public class assignment {
    public static void findOccer(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        findOccer(arr, key, i + 1);

    }
    //Question 2
    // You are given a number (eg - 2019), convert it into a String of english like
    //  “two zero one nine”. Use a recursive function to solve this problem
    // Sample Input : 1947
    // Sample Output : “one nine four seven”



    //Question 3 : Write a program to find Length of a String using Recursion

    public static int printLength(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return printLength(str.substring(1)) + 1;

    }

    // Question 4 : 
//We are given a string S, we need to find the count of all contiguous substrings
// starting and ending with the same character.
// Sample Input 1 : S = "abcab"
// Sample Output 1 : 7
// There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
// Out of the above substrings, there are 7 substrings : a, abca, b, bcab, c, a and b. So, only 7
// contiguous substrings start and end with the same character.
// Sample Input 2 : S = "aba"
// Sample Output 2 : 4
// The substrings are a, b, a and aba.



    public static void main(String args[]) {
    //     int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
    //     int key = 2;
    //     findOccer(arr, key, 0);
    //    System.out.println();

    //Question 3
    String str = "abcd";
    System.out.println(printLength(str));
    }
}
