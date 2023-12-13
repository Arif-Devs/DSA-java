

import java.util.*;

public class implementStackByDeque {
    static class Stack {
        Deque<Integer> deque = new LinkedList<>();
        
        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }
        
        public int peek() {
            return deque.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
    }
}
