package OnlineShoppingSystem;

import java.util.ArrayList;
import java.util.List;

public class Electronics extends Product{
    private String brand;
    private int warrantyPeriod;

    public Electronics(String productName, int productId, double price, int quantityInStock, String brand, int warrantyPeriod)
    {
        this.productName = productName;
        try
        {
            if(productId<0)
            {
                throw new IllegalArgumentException("Only Positive Values as ProductId");
            }
            if(Ids.contains(productId))
            {
                throw new DuplicateProductIDException("Duplicate ID entered");
            }
            this.productId = productId;
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        catch (DuplicateProductIDException e)
        {
            System.out.println("Duplicate ID entered");
        }
        Ids.add(productId);

        this.price = price;
        this.quantityInStock = quantityInStock;
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getID() {
        return productId;
    }

    @Override
    public void displayDetails()
    {
        System.out.println("Product Name: " + productName + "\nProduct Id: " + productId + "\nPrice: " + price + "\nQuantity In Stock: " + quantityInStock);
        System.out.println("Brand: " + brand + "\nWarranty Period: " + warrantyPeriod + " years\n");
    }

}
