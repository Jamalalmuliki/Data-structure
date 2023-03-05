import java.util.Stack;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack: " + stack);
        if (!stack.isEmpty()) {
            stack.pop();
            removeAll(stack);
            System.out.println("Stack: " + stack);
        }
    }
    public static void removeAll(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            stack.pop();
            removeAll(stack);
        }
    }
    }
