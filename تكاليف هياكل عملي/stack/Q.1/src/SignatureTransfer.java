import java.util.Stack;

public class SignatureTransfer {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> t = new Stack<>();

        // Push some elements onto stack s
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("stack s :"+s+ " ");
        // Transfer elements from stack s to stack t
        while (!s.empty()) {
            int x = s.pop();
            while (!t.empty() && x < t.peek()) {
                s.push(t.pop());
            }
            t.push(x);
        }

        // Print the contents of stack t
        System.out.print("Stack T: ");
        while (!t.empty()) {
            System.out.print(t.pop() + " ");
        }
    }
}