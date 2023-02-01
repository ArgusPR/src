package ques3;

import java.util.HashSet;
import java.util.Set;

public class ProductImpl {
    public static void main(String[] args) {
        Product p1 = new Product(1,"Laptop","60000");
        Product p2 = new Product(1,"Mouse","2000");
        Product p3 = new Product(2,"Mouse","1000");
        Product p4 = new Product(3,"Keyboard","2000");

        Set<Product> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        set.forEach(System.out::println);
    }
}
