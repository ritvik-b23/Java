import java.util.*;

public class lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Stack_Using_LinkedList st = new Stack_Using_LinkedList();
        int choice=0;

        while (true) {
            System.out.println("Chose an option:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Check Emptiness");
            System.out.println("4. Display stack");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    int num;
                    System.out.print("Enter a number to push: ");
                    num = sc.nextInt();
                    System.out.println();
                    st.push(num);
                    break;
                
                case 2:
                    st.pop();
                    break;
                
                case 3:
                    if (st.isEmpty())
                        System.out.println("The stack is empty.");
                    else
                        System.out.println("The stack is not empty.");
                    break;

                case 4:
                    st.display();
                    break;
                
                case 5:
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("ERROR");
                    break;
            }
        }
    }
}

class Stack_Using_LinkedList {
    private class Node {
        int data;
        Node link;
    }

    Node top;
    Stack_Using_LinkedList() { this.top = null; }

    Boolean isEmpty() { return top == null; } 

    public void push(int n) {
        Node temp = new Node();
        
        if (isEmpty()) {
            System.out.println("Overflow");
            return;
        }

        temp.data = n;
        temp.link = top;
        top = temp;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return;
        }

        top = (top).link;
    }

    public void display() {
        if (top == null) {
            System.out.printf("\nStack Underflow");
            System.exit(1);
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data);
                temp = temp.link;
                if(temp != null)
                    System.out.print(" -> ");
            }
        }
    }
}
