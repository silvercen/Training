package Model;

public class Product {

    private int productId;
    private String productName;
    private String desc;
    private float price;

    public Product(int productId, String productName, String desc, float price) {
        this.productId = productId;
        this.productName = productName;
        this.desc = desc;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void disp()
    {
        System.out.println( "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price + "\n");
    }

    @Override
    public String toString() {
        return "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", desc='" + desc + '\'' +
                ", price=" + price + "\n";
    }
}
