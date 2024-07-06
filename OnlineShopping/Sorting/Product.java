package Sorting;

import java.util.ArrayList;
import java.util.List;

public class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void display()
    {
        System.out.println("ID : " + id + " Name : " + name + " Price : " + price);
    }

    public static void main(String[] args)
    {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(12, "Potato", 120));
        productList.add(new Product(21, "Tomato", 100));
        productList.add(new Product(15, "Peach", 200));

        productList.stream().filter(product -> product.getPrice()>=100 && product.getPrice()<500).forEach(Product::display);
        productList.stream().map(product -> (product.price * 0.1)+product.price).forEach(System.out::println);
    }
}


