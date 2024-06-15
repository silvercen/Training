package Service;
import Model.Product;

public interface CartService {

    void addToCart(Product product);
    void displayCartDetails();

}
