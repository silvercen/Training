package Model;

public class Product {

    private int productId;
    private String productName;
    private String desc;
    private float price;
    private int quantity;

    public Product(int productId, String productName, String desc, float price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void disp()
    {
        System.out.println( "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price +
                ", quantity=" + quantity + "\n");
    }

    @Override
    public String toString() {
        return "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price + "\n";
    }
}
