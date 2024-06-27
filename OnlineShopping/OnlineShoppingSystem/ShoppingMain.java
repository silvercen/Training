package OnlineShoppingSystem;

public class ShoppingMain {
    public static void main(String[] args) throws ProductNotFoundException {
        Product one = new Electronics("Iphone 15", 421, 150000.00, 2, "Apple", 4);
        Product two = new Clothing("Green Jersey", 300, 1200.00, 2, "40M", "polyester");

        ShoppingCart cart = new ShoppingCart();

        cart.add(one);
        cart.add(two);

        cart.display();

        cart.delete(421);

        System.out.println("After Deletion: \n");

        cart.display();
    }
}
