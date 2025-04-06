import java.util.Stack;

public class PrefixToInfix {
    public static String convert(String expr) {
        Stack<String> stack = new Stack<>();
        for (int i = expr.length() - 1; i >= 0; i--) {
            char c = expr.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(c + "");
            } else {
                String a = stack.pop();
                String b = stack.pop();
                stack.push("(" + a + c + b + ")");
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String expr = "*+abc";
        System.out.println("Infix: " + convert(expr));
    }
}
