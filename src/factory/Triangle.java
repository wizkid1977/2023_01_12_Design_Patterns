package factory;

public class Triangle extends Shape{
    private int height, base;

    public Triangle(int x, int y, String color, int height, int base) {
        super(x, y, color);
        this.height = height;
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangle{" + super.toString() +
                ", height=" + height +
                ", base=" + base +
                '}';
    }


}
