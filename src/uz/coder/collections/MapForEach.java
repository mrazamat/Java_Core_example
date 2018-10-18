package uz.coder.collections;

import java.util.HashMap;
import java.util.Map;

public class MapForEach {

    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap<>();
        items.put("a", 10);
        items.put("b", 20);
        items.put("d", 30);

        items.forEach((k,v)-> System.out.println("Item: " + k + " Count: " + v));

        items.forEach((k,v)->{
            System.out.println("Item: " + k + " Count: " + v);
            if("b".equals(k)){
                System.out.println("Hello b");
            }
        });
    }

}
