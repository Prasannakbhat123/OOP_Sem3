class Stack<T> {
    private T[] elements;
    private int size;
    private int maxSize;

    @SuppressWarnings("unchecked")
    Stack(int maxSize) {
        this.maxSize = maxSize;
        this.elements = (T[]) new Object[maxSize];
        this.size = 0;
    }

    void push(T item) {
        if (size >= maxSize) {
            System.out.println("Stack Overflow");
            return;
        }
        elements[size++] = item;
    }

    T pop() {
        if (size == 0) {
            System.out.println("Stack Underflow");
            return null;
        }
        return elements[--size];
    }

    // Method that accepts a wildcard type
    void printElements(Stack<?> stack) {
        System.out.println("Stack contents:");
        for (int i = 0; i < stack.size; i++) {
            System.out.println(stack.elements[i]);
        }
    }
}

public class WildcardExample {
    public static void main(String[] args) {
        Stack<Object> objectStack = new Stack<>(10);

        // Pushing different types of elements onto the stack
        objectStack.push("Hello");
        objectStack.push(42);
        objectStack.push(3.14);
        objectStack.push(true);

        // Creating another stack to demonstrate wildcard usage
        Stack<Object> anotherStack = new Stack<>(10);
        anotherStack.push("World");
        anotherStack.push(100);

        // Printing elements of the first stack using a wildcard method
        objectStack.printElements(objectStack);
        
        // Printing elements of the second stack using the same wildcard method
        anotherStack.printElements(anotherStack);
    }
}
