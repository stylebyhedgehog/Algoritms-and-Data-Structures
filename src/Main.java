import DataStructures.StackArray;

public class Main {
    public static void main(String[] args) {
        StackArray<Integer> stack = new StackArray<Integer>(4);
        stack.push(5);
        stack.push(2);
        stack.pop();

        stack.sout();

    }
}