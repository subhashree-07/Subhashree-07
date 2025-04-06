import java.util.Stack;

public class PostfixToInfix {
    public static String convert(String expr) {
        Stack<String> stack = new Stack<>();
        for (char c : expr.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                stack.push(c + "");
            } else {
                String b = stack.pop();
                String a = stack.pop();
                stack.push("(" + a + c + b + ")");
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String expr = "ab+c*";
        System.out.println("Infix: " + convert(expr));
    }
}

