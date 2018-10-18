package uz.coder.collections;

import java.util.ArrayList;
import java.util.List;

public class LoopListWithLambda {
    public static void main(String[] args) {
        List<Integer> items = new ArrayList<>();
        items.add(10);
        items.add(100);
        items.add(1000);
        items.add(10000);
        items.add(100000);

        //lambda
        // Output: 10 100 1000 10000 100000
        items.forEach(item -> System.out.println(item));

        System.out.println("****************");

        //Output: 100
        items.forEach(item->{
            if(100==item){
                System.out.println(item);
            }
        });

        System.out.println("****************");

        // Output: 10 100 1000 10000 100000
        items.forEach(System.out::println);

        System.out.println("****************");
        // Output: 1000
        items.stream()
                .filter(s->s==1000)
                .forEach(System.out::println);

    }
}
