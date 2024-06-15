
import Model.*;
import Service.*;

public class OnlineShoppingMain {
    public static void main(String[] args)
    {
        Product p1 = new Product(1, "toy car", "wind up toy car", 50, 3);
        Product p2 = new Product(2, "scissors", "barbers scissors", 100, 1);
        Product p3 = new Product(3, "mic", "shure mic", 450, 2);

        CartServiceImplementation newCart = new CartServiceImplementation();

        newCart.addToCart(p1);
        newCart.displayCartDetails();
        newCart.addToCart(p2);
        newCart.addToCart(p3);
        newCart.displayCartDetails();
    }
}
