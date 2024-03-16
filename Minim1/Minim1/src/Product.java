public class Product {

    String productID;
    String name;
    double price;

    public double getPrice()
    {
        return this.price;
    }

    public String getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }
    public Product(String ID, String name, double price)
    {
        this.productID = ID;
        this.name =name;
        this.price = price;
    }
}
