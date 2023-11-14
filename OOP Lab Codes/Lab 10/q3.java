class Shape {
    private String color="red";
    private boolean filled=true;
    public Shape() {}
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }
    public String toString() {
        return String.format(
            "A Shape with color of %s and is %s",
            color, filled ? "filled" : "not filled"
        );
    }
}

class Circle extends Shape {
    private double radius=1.0;
    public Circle() {}
    public Circle(double radius) { this.radius = radius; }
    public Circle(double radius, String color, boolean filled) { super(color, filled); this.radius = radius; }
    public double getRadius() { return radius; }
    public void setRadius(double radius) {this.radius = radius; }
    public double getArea() { return 3.14*radius*radius; }
    public double getPerimeter() { return 2*3.14*radius; }
    public String toString() {
        return String.format(
            "Circle with radius=%f, which is a subclass of %s",
            radius, super.toString()
        );
    }
}

class Rectangle extends Shape {
    private double width=1.0;
    private double length=1.0;
    public Rectangle() {}
    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }
    public double getWidth() { return width; }
    public void setWidth(double width) {this.width = width; }
    public double getLength() { return length; } 
    public void setLength(double length) {this.length = length; }
    public double getArea() { return width*length; }
    public double getPerimeter() { return 2*(width+length); }
    public String toString() {
        return String.format(
            "Rectangle with width=%f and length=%f, which is a subclass of %s",
            width, length, super.toString()
        );
    }
}

class Square extends Rectangle {
    public Square() {}
    public Square(double side) { super(side, side); }
    public Square(double side, String color, boolean filled) { super(side, side, color, filled); }
    public double getSide() { return super.getWidth(); }
    public void setSide(double side) { super.setWidth(side); super.setLength(side); }
    public void setWidht(double side) { super.setWidth(side); }
    public void setLength(double side) { super.setLength(side); }
     public String toString() {return "Square of side " + getSide();}
}

public class q3 {
    public static void main(String[] args) {
        Shape shape = new Shape("blue", false);
        System.out.println(shape + "\n");

        Circle circle = new Circle(10);
        System.out.println(circle);
        System.out.println("area = " + circle.getArea());
        System.out.println("perimeter = " + circle.getPerimeter() + "\n");

        Rectangle rect = new Rectangle(20, 30);
        System.out.println(rect);
        System.out.println("area = " + rect.getArea());
        System.out.println("perimeter = " + rect.getPerimeter() + "\n");

        Square sq = new Square(25);
        System.out.println(sq);
        System.out.println("area = " + sq.getArea());
        System.out.println("perimeter = " + sq.getPerimeter());
        System.out.println("changing WIDTH to 10");
        sq.setWidth(10);
        System.out.println(sq);
    }
}