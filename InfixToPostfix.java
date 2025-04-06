public class InfixToPostfix {
    static int precedence(char ch) {
        switch (ch) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }

    public static String convert(String exp) {
        StringBuilder result = new StringBuilder();
        char[] stack = new char[exp.length()];
        int top = -1;

        for (char c : exp.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            } else if (c == '(') {
                stack[++top] = c;
            } else if (c == ')') {
                while (top >= 0 && stack[top] != '(') {
                    result.append(stack[top--]);
                }
                top--; // Pop '('
            } else {
                while (top >= 0 && precedence(c) <= precedence(stack[top])) {
                    result.append(stack[top--]);
                }
                stack[++top] = c;
            }
        }

        while (top >= 0) {
            result.append(stack[top--]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Postfix: " + convert(exp));
    }
}
