package builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private int width;
    private int slices;
    private List<String> toppings = new ArrayList<>();

    public Pizza() { }

    public Pizza(int width, int slices, List<String> toppings) {
        this.width = width;
        this.slices = slices;
        this.toppings = toppings;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getSlices() {
        return slices;
    }

    public void setSlices(int slices) {
        this.slices = slices;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "width=" + width +
                ", slices=" + slices +
                ", toppings=" + toppings +
                '}';
    }
}
