package OnlineShoppingSystem;

public class Clothing extends Product{
    private String size;
    private String material;

    public Clothing(String productName, int productId, double price, int quantityInStock, String size, String material)
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
            System.exit(1);
        }
        Ids.add(productId);
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.size = size;
        this.material = material;
    }

    public int getID() {
        return productId;
    }

    @Override
    public void displayDetails()
    {
        System.out.println("Product Name: " + productName + "\nProduct Id: " + productId + "\nPrice: " + price + "\nQuantity In Stock: " + quantityInStock);
        System.out.println("Size: " + size + "\nMaterial: " + material + "\n");
    }
}
