package factory;

public class Program {
    public static void main(String[] args) {
        System.out.println(Shape.createShape(10, 30));

        System.out.println(new Circle(2,5,"Red", 12.8));
    }
}
