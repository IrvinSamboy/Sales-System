package order;

import product.Product;

public class Order {
    private static int orderCount;
    private final int idOrder;
    private static final int MAx_PRODUCTS = 10;
    private Product[] products;
    private int productCounter;

    public Order(){
        Order.orderCount++;
        this.idOrder = Order.orderCount;
        this.products = new Product[Order.MAx_PRODUCTS];
    }

    public void addProduct(Product product) {
        if(productCounter <= MAx_PRODUCTS){
            this.products[this.productCounter++] = product;
        }
        else {
            System.out.println("You reached the maximum number of products");
        }
    }

    
}
