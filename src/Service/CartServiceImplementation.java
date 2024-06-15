package Service;

import Model.*;

public class CartServiceImplementation implements CartService{

    Cart one =  new Cart();

    @Override
    public void addToCart(Product product) {
        one.addProd(product);
    }

    @Override
    public void displayCartDetails() {
        one.dispProd();
    }
}
