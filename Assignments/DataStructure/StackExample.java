package DataStructure;

import java.util.Stack;

public class StackExample {

    static void stackPush(Stack<Integer> s) {
        for (int i = 0; i < 7; i++) {
            s.push(i);
        }
    }

    static void stackPop(Stack<Integer> s) {
        System.out.println("Pop operation");
        for (int j = 0; j < 3; j++) {
            System.out.println(s.pop());
        }
    }

    static void stackPeek(Stack<Integer> s) {
        System.out.println("Element on top is: " + s.peek());
    }

    static void stackSearch(Stack<Integer> s, int element) {
        int pos = s.search(element);
        System.out.println(pos);
        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element is found at position: " + pos);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stackPush(stack);
        stackPop(stack);
        stackPeek(stack);
        stackSearch(stack, 1);
    }

}
