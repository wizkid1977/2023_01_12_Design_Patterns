package builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {


        Pizza pizza1 = PizzaBuilder.getInstance()
                .setWidth(30)
                .addTopping("olives")
                .build();

        System.out.println(pizza1);


        Pizza pizza2 = PizzaBuilder.getInstance()
                .addTopping("Shrooms")
                .setWidth(10)
                .addTopping("Olives")
                .removeTopping("Shrooms")
                .build();

        System.out.println(pizza2);


        List<String> texts = List.of("one", "tw", "Three");
        texts.stream()
                .filter((z)-> z.length() <= 3)
                .sorted((x, y)-> x.length() - y.length())
                .forEach(text-> System.out.println(text));


//        texts.stream()
//                .filter(new Predicate<String>() {
//                    @Override
//                    public boolean test(String s) {
//                        return s.length() <= 3;
//                    }
//                }).sorted(new Comparator<String>() {
//                    @Override
//                    public int compare(String o1, String o2) {
//                        return o1.length() - o2.length();
//                    }
//                }).forEach(new Consumer<String>() {
//                    @Override
//                    public void accept(String s) {
//                        System.out.println(s);
//                    }
//                });

    }
}
