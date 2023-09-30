package InterableAndIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart implements Iterable<Product> {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product){
        productList.add(product);
    }
    @Override
    public Iterator<Product> iterator() {
        return new ProductIterator();
    }

    public class ProductIterator implements Iterator<Product> {
        private  int cursor = 0;
        @Override
        public boolean hasNext() {
            return cursor < productList.size();
        }

        @Override
        public Product next() {
            Product p = productList.get(cursor);
            cursor += 1;

            return  p;
        }
    }


}
