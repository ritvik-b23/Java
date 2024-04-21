import java.util.*;

public class lab7try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> stack = new LinkedList<>();

        int choice;
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
                    System.out.print("Enter number to be pushed: ");
                    int num = sc.nextInt();
                    stack.add(num);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Poping element: " + stack.getLast());
                    stack.removeLast();
                    break;

                case 3:
                    if (stack.isEmpty())
                        System.out.println("Stack is empty.");
                    else
                        System.out.println("Stack is not empty.");
                    break;

                case 4:
                    System.out.println(stack);
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("ERROR");
                    break;
            }
        }
    }
}
