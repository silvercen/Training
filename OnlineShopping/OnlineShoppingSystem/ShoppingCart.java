package OnlineShoppingSystem;

import java.awt.color.ProfileDataException;
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

    public void delete(int id) throws ProductNotFoundException {
        boolean flag = false;

        for(Product p:products)
        {
            if(p.getID()==id)
            {
                flag = true;
                products.remove(p);
                break;
            }
        }

        if(flag==false)
        {
            throw new ProductNotFoundException("Invalid Product ID");
        }
    }
}
