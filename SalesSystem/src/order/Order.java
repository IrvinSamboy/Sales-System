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
        if(this.productCounter <= MAx_PRODUCTS){
            this.products[this.productCounter++] = product;
        }
        else {
            System.out.println("You reached the maximum number of products");
        }
    }

    public double calcTotal() {
        double total = 0;
        for (int i=0; i<this.productCounter; i++){
            total += this.products[i].getPrice();
        }

        return total;
    }

    public void showOrder() {
        System.out.println("OrderId: " + this.idOrder);
        double orderTotal = calcTotal();
        System.out.println("Total order = " + orderTotal);
        System.out.println("Products = " + productCounter);
        for (int i=0; i<this.productCounter; i++) {
            System.out.println(this.products[i].toString());
        }
    }
}
