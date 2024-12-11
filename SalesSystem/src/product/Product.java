package product;

public class Product {
    private static int ProductCount;
    private String productName;
    private int idProduct;
    private double price;

    public Product() {
        Product.ProductCount++;
        this.idProduct = Product.ProductCount;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getIdProduct() {
        return this.idProduct;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
