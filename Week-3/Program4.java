import java.util.Scanner;

class Stack {
    int[] arr;
    int tos;
    Scanner sc = new Scanner(System.in);

    void initialise() {
        tos = -1;
        System.out.print("Enter the max length of the stack: ");
        int n = sc.nextInt();
        arr = new int[n];
    }

    void push() {
        System.out.print("\nEnter the integer to push: ");
        int t = sc.nextInt();
        if (tos < arr.length - 1) { 
            arr[++tos] = t; 
        } else {
            System.out.print("\nError: Stack Overflow.");
        }
    }

    void pop() {
        if (tos == -1) {
            System.out.print("\nError: Stack Underflow.");
        } else {
            System.out.println("Popped element: " + arr[tos--]);
        }
    }

    void display() {
        if (tos == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= tos; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        s.initialise();
        int input = 1;
        int flag = 1;
        while (input != -1 && flag != 0) {
            System.out.print("\nEnter 1 for Push, 2 for Pop, 3 for Display and -1 to Exit: ");
            input = sc.nextInt();
            if (input == 1)
                s.push();
            else if (input == 2)
                s.pop();
            else if (input == 3)
                s.display();
            else if (input == -1) {
                System.out.println("Exiting...");
                flag = 0;
            } else {
                System.out.println("Invalid option. Please enter 1, 2, 3, or -1.");
            }
        }
    }
}
