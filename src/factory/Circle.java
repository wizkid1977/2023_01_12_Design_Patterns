package factory;

public class Circle extends Shape{

    private double radius;

    public Circle(int x, int y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString() +
                ", radius=" + radius +
                '}';
    }
}
