public class StackArray {
    private int maxSize;
    private int[] stack;
    private int top;

    public StackArray(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stack[++top] = value;
        }
    }

    public int pop() {
        if (top >= 0) {
            return stack[top--];
        }
        return -1;
    }

    public int peek() {
        return (top >= 0) ? stack[top] : -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(25);
        stack.push(58);
        stack.push(68);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
