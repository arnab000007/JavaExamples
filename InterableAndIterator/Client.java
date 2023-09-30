package InterableAndIterator;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Product("laptop"));
        shoppingCart.addProduct(new Product("mobile"));
        shoppingCart.addProduct(new Product("soap"));


        Iterator<Product> itr = shoppingCart.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        for(Product product: shoppingCart) {
            System.out.println(product);
        }
    }
}
