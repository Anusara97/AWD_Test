public class Stack {
    private int[] stk;
    private int top;

    public Stack() {
        stk = new int[10];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stk.length - 1;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is underflow.");
        } else {
            int ele = stk[top--];
            return ele;
        }
    }
}