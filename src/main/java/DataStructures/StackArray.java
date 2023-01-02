package DataStructures;

import java.util.Arrays;

public class StackArray<T> {
    private Object[] arr;
    private int top;
    private int capacity;

    public StackArray(int size){
        arr = new Object[size];
        capacity = size;
        top = -1;
    }

    public void push(T x){
        if (isFull()){
            System.out.println("Stack is OverFlow");
        }
        arr[++top] = x;
    }

    public T pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            System.exit(1);
        }
        return element(top--);
    }

    public boolean isFull(){
        return top == capacity - 1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    @SuppressWarnings("unchecked")
    private T element(int index) {
        return (T)arr[index];
    }

    public void sout(){
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
