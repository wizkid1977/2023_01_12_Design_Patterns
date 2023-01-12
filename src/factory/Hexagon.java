package factory;

public class Hexagon extends Shape{

    private int width;

    public Hexagon(int x, int y, String color, int width) {
        super(x, y, color);
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Hexagon{" + super.toString() +
                ", width=" + width +
                '}';
    }
}
