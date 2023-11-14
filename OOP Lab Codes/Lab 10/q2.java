abstract class Car {
    double price;
    int year;
    public Car(double price, int year) {
        this.price = price;
        this.year = year;
    }
    public String toString() { return getClass().getName()+"[price="+price+",year="+year+",sales price="+calculateSalePrice()+"]"; }
    public abstract double calculateSalePrice();
}

class ClassicCar extends Car {
    public ClassicCar(double price, int year) {
        super(price, year);
    }

    @Override
    public double calculateSalePrice() {
        return 10000;
    }
}

class SportCar extends Car {
    public SportCar(double price, int year) {
        super(price, year);
    }

    @Override
    public double calculateSalePrice() { 
        if (super.year > 2000) { return 0.75 * super.price; }
        if (super.year > 1995) { return 0.5 * super.price; }
        return 0.25 * super.price;
    }
}

public class q2 {
    public static void main(String[] args) {
        Car classic = new ClassicCar(100000, 2023);
        Car sport = new SportCar(10000, 2024);

        classic.calculateSalePrice();
        System.out.println(classic);
        sport.calculateSalePrice();
        System.out.println(sport);
    }
}
