package OnlineShoppingSystem;

public class Product {
    protected String productName;
    protected int productId;
    protected double price;
    protected int quantityInStock;

    public void displayDetails()
    {
        System.out.println("Product Name: " + productName + "\nProduct Id: " + productId + "\nPrice: " + price + "\nQuantity In Stock: " + quantityInStock + "\n");
    }
}