import java.util.*;

class Area{
    private int side1, side2;
    private int area1;
    private float area2;
    private float area3;

    // public Area(int side1, int side2) {
    //     this.side1 = side1;
    //     this.side2 = side2;
    // }

    public void calcArea(int side1){

        area1 = side1*side1;
        System.out.println(area1);
    }

    public void calcArea(float side1){
        float pi = 3.14f;
        area2 = (float) (pi*((float)side1)*((float)side1));
        System.out.println(area2);
    }

    public void calcArea(float side1, float side2){
        area3 = (side1*side2);
        System.out.println(area3);
    }

    void display(){
        System.out.println("Area of square: "+area1+", Area of circle: "+area2+", Area of rectangle: "+area3);
    }

}

public class q1{
    public static void main(String[] args) {
        int side1, side2, choice;

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter side 1: ");
        // side1 = sc.nextInt();
        // System.out.println("Enter side 2: ");
        // side2 = sc.nextInt();
        // Area a = new Area(side1, side2);
        Area a = new Area();

        while (true) {
            System.out.println("Which area to claculate:");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Rectangle");
            System.out.println("4. Display all");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter side: ");
                    int side = sc.nextInt();
                    a.calcArea(side);
                    break;
                case 2:
                    System.out.println("Enter radius: ");
                    int s = sc.nextInt();
                    a.calcArea((float)s);
                    break;
                case 3:
                    System.out.println("Enter side1: ");
                    side1 = sc.nextInt();
                    System.out.println("Enter side2: ");
                    side2 = sc.nextInt();
                    a.calcArea(side1, side2);
                    break;
                case 4:
                    a.display();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input.");
            }
        }
    }
}