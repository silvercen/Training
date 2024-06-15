package Model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> products = new ArrayList<>();
    private float totalValue=0;

    public void addProd(Product product)
    {
        products.add(product);
    }

    public void dispProd()
    {
//        System.out.println(products.toString().replace("[", "").replace("]",""));

        for(Product p:products)
        {
            p.disp();
            totalValue = totalValue + p.getPrice();
        }
        System.out.println("Total Price : " + totalValue + "\n");
    }
}
