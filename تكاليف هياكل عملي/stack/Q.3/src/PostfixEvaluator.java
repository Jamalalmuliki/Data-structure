import java.util.Stack;

public class PostfixEvaluator {
    public static int evaluate(String expr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (Character.isDigit(c)) {
                int num = c - '0';
                while (i + 1 < expr.length() && Character.isDigit(expr.charAt(i + 1))) {
                    num = num * 10 + (expr.charAt(i + 1) - '0');
                    i++;
                }
                stack.push(num);
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                int op2 = stack.pop();
                int op1 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(op1 + op2);
                        break;
                    case '-':
                        stack.push(op1 - op2);
                        break;
                    case '*':
                        stack.push(op1 * op2);
                        break;
                    case '/':
                        if (op2 == 0) throw new ArithmeticException("Division by zero");
                        stack.push(op1 / op2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String expr = "23+45-*";
        System.out.println(evaluate(expr)); // Output: -13
    }
}