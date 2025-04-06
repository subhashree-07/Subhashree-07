public class QueueArray {
    private int front, rear, capacity;
    private int[] queue;

    public QueueArray(int size) {
        front = 0;
        rear = 0;
        capacity = size;
        queue = new int[capacity];
    }

    public void enqueue(int data) {
        if (rear == capacity) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear++] = data;
    }

    public void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
    }

    public void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public int peek() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();       // Output: 10 20 30
        q.dequeue();
        q.display();       // Output: 20 30
        System.out.println(q.peek());  // Output: 20
    }
}
