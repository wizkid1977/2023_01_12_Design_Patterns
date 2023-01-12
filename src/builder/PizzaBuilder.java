package builder;

public class PizzaBuilder {
    private static Pizza pizza;
    private static PizzaBuilder instance;

    private PizzaBuilder() {
        pizza = new Pizza();
    }

    public static PizzaBuilder getInstance() {
        if(instance == null)
            instance = new PizzaBuilder();
        return instance;
    }

    public PizzaBuilder setWidth(int width){
        pizza.setWidth(width);

        if(width < 20)
            pizza.setSlices(1);
        else if(width < 30)
            pizza.setSlices(4);
        else
            pizza.setSlices(8);

        return getInstance();
    }

    public PizzaBuilder setSlices(int slices){
        pizza.setSlices(slices);
        return getInstance();
    }

    public PizzaBuilder addTopping(String topping){
        pizza.getToppings().add(topping);
        return getInstance();
    }

    public PizzaBuilder removeTopping(String topping){
        pizza.getToppings().remove(topping);

        return getInstance();
    }

    public Pizza build(){
        Pizza myPizza = pizza;
        pizza = new Pizza();
        return myPizza;
    }
}
