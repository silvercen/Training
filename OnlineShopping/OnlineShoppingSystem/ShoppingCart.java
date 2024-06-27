package OnlineShoppingSystem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products = new ArrayList<>();

    public void add(Product product)
    {
        products.add(product);
    }

    public void display()
    {
        for(Product p:products)
        {
            p.displayDetails();
        }
    }
}
