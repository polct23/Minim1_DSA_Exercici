public class Main {
    public static void main(String[] args) {
        ProductManager pm;
        pm = new ProductManagerImp();

        pm.addProduct("B001", "Coca cola", 2);
        pm.addProduct("C002", "Café amb gel", 1.5);
        pm.addProduct("A002", "Donut", 2.25);
        pm.addProduct("A003", "Croissant", 1.25);

        List<Product> products = this.pm.productsByPrice();


        pm.addUser("1111111", "Juan", "lopez");
        pm.addUser("2222222",  "David", "Rincon");
        pm.addUser("3333333",  "Juan", "Hernández");

        Order o1 = new Order("1111111");
        o1.addLP(3, "B001");
        o1.addLP(2, "C002");

        Order o2 = new Order("1111111");
        o2.addLP(3, "A002");
        o2.addLP(1, "B001");

        Order o3 = new Order("2222222");
        o3.addLP(3, "B001");
        o3.addLP(2, "A002");

        this.pm.addOrder(o1);
        this.pm.addOrder(o2);
        this.pm.addOrder(o3);

        Order order1 = this.pm.processOrder();
        Order order2 = this.pm.processOrder();
        Order order3 = this.pm.processOrder();

        List<Product> products = this.pm.productsByPrice();
        List<Product> products = this.pm.productsBySales();

        List<Order> orders1 = this.pm.ordersByUser("1111111");
        List<Order> orders2 = this.pm.ordersByUser("2222222");
    }
}
