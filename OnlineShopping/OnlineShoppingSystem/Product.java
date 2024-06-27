package OnlineShoppingSystem;

import java.util.ArrayList;
import java.util.List;

public class Product {
    protected String productName;
    protected int productId;
    protected double price;
    protected int quantityInStock;
    protected static List<Integer> Ids = new ArrayList<>();

    public int getID()
    {
        return productId;
    }

    public void displayDetails()
    {
        System.out.println("Product Name: " + productName + "\nProduct Id: " + productId + "\nPrice: " + price + "\nQuantity In Stock: " + quantityInStock + "\n");
    }
}