import java.util.*;

class Cars{
    String vehicle_id;
    float[] cost;  // stores base, excercise duty, slaes tax for each car
    float total;  // sotres total after calc_total()
    float grand_total; // stores prices after subtracting discount
    float discount = 0.1f;
    Scanner sc = new Scanner(System.in);

    public Cars(String vehicle_id, float b, float e, float s) {
        this.vehicle_id = vehicle_id;
        cost = new float[] {b,s,e};
    }

    public void calc_total() {
        total = cost[0] + cost[1] + cost[2];
    }

    public void calc_grandTotal() {
        grand_total = total - (discount*total);
    }

    void display() {
        System.out.println("Vehicle ID: "+vehicle_id+", Total: "+total+", Grand total: "+grand_total);
    }
}

public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of cars: ");
        int num_car = sc.nextInt();
        sc.nextLine();
        Cars[] obj = new Cars[num_car];


        for (int i = 0; i < obj.length; i++) {
            System.out.println("Car #"+(i+1));
            System.out.println("Enter vehicle id: ");
            String vid = sc.nextLine();

            System.out.println("Enter base price: ");
            float b = sc.nextFloat();
            System.out.println("Enter excercise duty: ");
            float e = sc.nextFloat();
            System.out.println("Enter sales tax: ");
            float s = sc.nextFloat();
            sc.nextLine();

            obj[i] = new Cars(vid, b, e, s);
            obj[i].calc_total();
            obj[i].calc_grandTotal();

            System.out.println("");
        }

        Cars max = obj[0];
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].grand_total > max.grand_total) {
                max = obj[i];
            }
        }

        System.out.println("Car with the highest grand total: ");
        max.display();
    }
}