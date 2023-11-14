import java.util.*;

class Purse{
    private int dirham;
    private int fills50;
    private int fills25;
    private double total;

    //public Purse(double total) {
    //    this.total = total;
    //}

    public void add_dirham(double a) {
        total += a;
    }
    public void remove_dirham(double a) {
        total -= a;
    }

    public void add_50fills() {
        total += 0.5;
    }
    public void remove_50fills() {
        total -= 0.5;
    }

    public void add_25fills() {
        total += 0.25;
    }
    public void remove_25fills() {
        total -= 0.25;
    }

    public void total_cash() {
        System.out.println("Total cash: "+total);
    }

}

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
      //  double t;
      //System.out.println("Enter total cash: ");
       // t = sc.nextDouble();

        Purse ob1 = new Purse();

        while(true) {
            System.out.println("1. Add dirham");
            System.out.println("2. Remove dirham");
            System.out.println("3. Add 50 fills");
            System.out.println("4. Remove 50 fills");
            System.out.println("5. Add 25 fills");
            System.out.println("6. Remove 25 fills");
            System.out.println("7. Total cash");
            System.out.println("8. Exit");

            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter amount");
                double amt = sc.nextInt();
                ob1.add_dirham(amt);
            }
            if (choice == 2) {
                double amt;
                System.out.println("Enter amount to remove:");
                amt = sc.nextDouble();
                ob1.remove_dirham(amt);
            }
            if (choice == 3) {
                ob1.add_50fills();
            }
            if (choice == 4) {
                ob1.remove_50fills();
            }
            if (choice == 5) {
                ob1.add_25fills();
            }
            if (choice == 6) {
                ob1.remove_25fills();
            }
            if (choice == 7) {
                ob1.total_cash();
            }
            if (choice == 8) {
                sc.close();
                System.exit(0);
            }
        }
    }
}
