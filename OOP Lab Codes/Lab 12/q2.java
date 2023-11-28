import java.util.*;

class Book implements Comparable<Book> {
    private String name;
    private double cost;

    public Book(){}

    public Book(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    
    public String getName() { return name; }
    public double getCost() { return cost; }
    
    @Override
    public int compareTo(Book temp) {

        return getName().compareTo(temp.getName());
    }

    public String toString() {
        return String.format("Book[name=%s, cost=%f]", name, cost);
    }
}

class GeneralizedSearch {

    public static boolean search(Object[] arr, Object item) {
        for (int i = 0; i < arr.length; i++) {
            if (((Comparable)item).compareTo((Comparable)arr[i]) == 0) {
                return true;
            }
        }
        return false;
    }
}

class ok implements Comparator<Book>{
    @Override
    public int compare(Book o1, Book o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }

}

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Book 1", 100));
        books.add(new Book("Book 2", 200));
        books.add(new Book("Book 3", 300));

        System.out.println("Enter book to search: ");
        String searchBook = sc.nextLine();
        System.out.println(GeneralizedSearch.search(books.toArray(), new Book(searchBook, 0)));

        books.sort(new ok().reversed());
        System.out.println(books);

    }
}
