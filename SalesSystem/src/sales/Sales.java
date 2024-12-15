package sales;

import order.Order;
import product.Product;

public class Sales {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setProductName("T-shirt");
        product1.setPrice(30.00);

        Product product2 = new Product();
        product2.setProductName("Shoes");
        product2.setPrice(50.00);

        Order order = new Order();

        order.addProduct(product1);
        order.addProduct(product2);

        System.out.println("TOTAL: " + order.calcTotal());

        order.showOrder();
    }
}
