public class CustomStack {
    private int[] stack;
    private int top;
    private int size;

    public CustomStack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    public void AddElement(int element) {
        if (this.top == this.size - 1) {
            System.out.println("Stack is full!");
        } else {
            this.stack[++this.top] = element;
        }
    }

    public int RemoveElement() {
        if (this.top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return this.stack[this.top--];
        }
    }

    public int LastInStack() {
        if (this.top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return this.stack[this.top];
        }
    }

    public boolean StackIsEmpty() {
        return this.top == -1;
    }

    public boolean StackIsFull() {
        return this.top == this.size - 1;
    }

    public void display() {
        if (this.top == -1) {
            System.out.println("Stack is empty!");
        } else {
            for (int i = this.top; i >= 0; i--) {
                System.out.println(this.stack[i]);
            }
        }
    }
}
