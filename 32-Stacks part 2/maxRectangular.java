

import java.util.Stack;

public class maxRectangular {
    public static void histogram(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();

        // Next smaller right

        for (int i = arr.length - 1; i >=0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //Next smaller left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //Current area
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currentArea = height * width;
            maxArea = Math.max( currentArea,maxArea);
        }
System.out.println("max area is = " +maxArea);
        
    }
    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        histogram(arr);
    }
}
