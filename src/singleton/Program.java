package singleton;

public class Program {
    public static void main(String[] args) {
        //CEO amazonCeo = new CEO("Bezos", 45, 35_000_000);
        //CEO jbCeo = new CEO("Ziv", 50, 50_000);

        System.out.println( CEO.getInstance() );
        CEO mankal = CEO.getInstance();

        mankal.setName("Zukerberg");

        System.out.println(CEO.getInstance());

        System.out.println();
    }
}
