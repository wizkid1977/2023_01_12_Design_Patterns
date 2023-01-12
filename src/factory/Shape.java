package factory;

import java.util.Random;

public abstract class Shape {
    private int x, y;
    private String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }

    public static Shape createShape(){
        Random random = new Random();
        switch (random.nextInt(3)){
            case 0:
                return new Circle(random.nextInt(10),random.nextInt(10),
                        "green", random.nextDouble()*20);
            case 1:
                return new Triangle(random.nextInt(10),random.nextInt(10),
                        "green", random.nextInt(30),random.nextInt(30));
            case 2:
                return new Hexagon(random.nextInt(10),random.nextInt(10),
                        "green",random.nextInt(30));
        }

        return null;
    }

    public static Shape createShape(int x, int y){
        Random random = new Random();
        switch (random.nextInt(3)){
            case 0:
                return new Circle(x, y,
                        "green", random.nextDouble()*20);
            case 1:
                return new Triangle(x, y,
                        "green", random.nextInt(30),random.nextInt(30));
            case 2:
                return new Hexagon(x, y,
                        "green",random.nextInt(30));
        }

        return null;
    }
}
