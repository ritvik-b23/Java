import java.lang.*;
import java.util.*;

class Ques1 {
    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);
        double r,pi,area,d,c;
        pi = Math.PI; 

        System.out.println(" * Circle Calc * ");

        System.out.println("Enter the radius: ");
        r = radius.nextDouble();
        area = pi*r*r;
        d = 2*r;
        c = 2*pi*r;

        System.out.println("Diameter = "+d);
        System.out.println("Area = "+area);
        System.out.println("Circumference = "+c);

        radius.close();
    }
}