package stack;

public class Stack {

    private int maxSize;
    private long[] stackArray;
    private int top;

    Stack(int size){
        this.maxSize = size;
        stackArray = new long[maxSize];
        top = -1;
    }

    public void push(long i) {
        if(isFull()) {
            System.out.println("The stack is full");
        }else {
            top++;
            stackArray[top] = i;
        }
    }

    public long pop() {
        if(isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        }else {
            return stackArray[top--];
        }
    }

    public long peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1) ;
    }

    public boolean isFull() {
        return (maxSize-1 == top);
    }
}
