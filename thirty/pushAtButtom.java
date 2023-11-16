package thirty;

import java.util.Stack;



public class pushAtButtom {
    public static void pushButtom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushButtom(s, data);
        s.push(top);
    }

    //reverse

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    //Reverse stack
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushButtom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        

        // pushButtom(s, 4);
        // while (!s.isEmpty()) {
         //   System.out.println(s.pop());
        // };
        //reverse string ->
        // String str = "abc";
        // String result = reverseString(str);
        // System.out.println(result);
        reverseStack(s);
        printStack(s);
    }
}
