package OnlineShoppingSystem;

public class Clothing extends Product{
    private String size;
    private String material;

    public Clothing(String productName, int productId, double price, int quantityInStock, String size, String material)
    {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayDetails()
    {
        System.out.println("Product Name: " + productName + "\nProduct Id: " + productId + "\nPrice: " + price + "\nQuantity In Stock: " + quantityInStock);
        System.out.println("Size: " + size + "\nMaterial: " + material + "\n");
    }
}
