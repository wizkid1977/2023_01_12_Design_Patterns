package singleton;

public class CEO {
    private String name;
    private int age;
    private double salary;

    private static CEO instance;

    private CEO(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static CEO getInstance() {
        if(instance == null){
            instance = new CEO("Ziv", 50, 50_000);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "CEO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
