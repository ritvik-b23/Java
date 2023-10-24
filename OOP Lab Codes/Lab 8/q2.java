import java.util.*;

class Book {
    private long isbnNo;
    private String name, auth, publisher;
    private int ed, status;

    public Book(long isbnNo, String name, String auth, String publisher, int ed, int status) {
        this.isbnNo = isbnNo;
        this.name = name;
        this.auth = auth;
        this.publisher = publisher;
        this.ed = ed;
        this.status = status;
    }

    public void check_status() {
        if(status==0) { System.out.println("Status is: Available"); }
        else if(status==1) { System.out.println("Status is: Issued"); }
        else if(status==2) { System.out.println("Status is: Reserved"); }
    }

    public void change_status(int a) {
        status = a;
        System.out.println("Status changed.");
    }

    public void display() {
        System.out.println("ISBN no: "+isbnNo);
        System.out.println("Name: "+name);
        System.out.println("Author:"+auth);
        System.out.println("Publisher: "+publisher);
        System.out.println("Edition: "+ed);
        System.out.println("Status: "+status);
    }
}

public class q2 {
    static long isbnNo;
    static String name, auth, publisher;
    static int ed, status, choice;

    public static Book input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details for book: ");
        System.out.print("ISBN no: "); isbnNo = sc.nextLong(); sc.nextLine();
        System.out.print("name: ");name = sc.nextLine();
        System.out.print("Author: ");auth = sc.nextLine();
        System.out.print("Publisher: ");publisher = sc.nextLine();
        System.out.print("Edition: ");ed = sc.nextInt();
        sc.nextLine();
        System.out.print("Status: ");status = sc.nextInt();
        sc.nextLine();
        return new Book(isbnNo, name, auth, publisher, ed, status);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Book> L = new LinkedList<>();

        System.out.println("Book 1: ");
        Book obj1 = input();
        System.out.println("Book 2:");
        Book obj2 = input();

        L.add(obj1);
        L.add(obj2);
        // Book obj3 = input();
        // Book obj4 = input();
        // L.addFirst(obj3);
        // L.addLast(obj4);

        while(true) {
            System.out.println();
            System.out.println("1. Check status ");
            System.out.println("2. Change status");
            System.out.println("3. Display");
            System.out.println("4. Add book to the start of list");
            System.out.println("5. Add book to the end of list");
            System.out.println("6. Exit");
            System.out.println("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Book to check status: ");
                    int bk = sc.nextInt();
                    if (bk==1) { L.get(0).check_status(); }
                    else if(bk==2) { L.get(1).check_status(); }
                    else if(bk==3) { L.get(2).check_status(); }
                    else if(bk==4) { L.get(3).check_status(); }
                    break;

                case 2:
                    System.out.println("Book to change status of: ");
                    int stat = sc.nextInt();
                    System.out.println("Enter the status to be set(0-Available ; 1-Issued; 2-Reserved): ");
                    int s = sc.nextInt();
                    if (stat==1) { L.get(0).change_status(s); }
                    else if(stat==2) { L.get(1).change_status(s); }
                    else if(stat==3) { L.get(2).change_status(s); }
                    else if(stat==4) { L.get(3).change_status(s); }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Enter number of book to display:");
                    int ch = sc.nextInt();
                    if (ch==1) {
                        L.get(0).display();
                    }
                    if (ch==2) {
                        L.get(1).display();
                    }
                    if (ch==3) {
                        L.get(2).display();
                    }
                    if (ch==4) {
                        L.get(3).display();
                    }
                    break;
                    // System.out.println("Details for book 1:");
                    // obj1.display();
                    // System.out.println();
                    // System.out.println("Details for book 2: ");
                    // obj2.display();
                    // System.out.println();
                    // break;

                case 4:
                    System.out.println("Enter book details:");
                    Book newbookFront = input();
                    L.addFirst(newbookFront);
                    System.out.println("Added new book to the start of the linked list.");
                    break;

                case 5:
                    System.out.println("Enter book details:");
                    Book newbookBack = input();
                    L.addLast(newbookBack);
                    System.out.println("Book added to the end of the linked list.");
                    break;
                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}
