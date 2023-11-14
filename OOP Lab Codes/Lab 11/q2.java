interface Drawable {
    public void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Draws a circle.");
    }
}
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Draws a rectangle.");
    }
}
class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Draws a triangle.");
    }
}

public class q2 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rect = new Rectangle();
        Triangle triangle = new Triangle();

        circle.draw();
        rect.draw();
        triangle.draw();
    }
}
