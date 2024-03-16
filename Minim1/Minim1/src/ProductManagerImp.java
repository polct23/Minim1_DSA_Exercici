import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;

public abstract class ProductManagerImp implements ProductManager{

    ArrayList<Product> L;
    HashMap<String, User> H;
    Queue<Order> Q;

    public ProductManagerImp()
    {

    }

    public ArrayList<Product> productsByPrice(ArrayList<Product> L)
    {
        ArrayList<Product> productosOrdenados = L;
        productosOrdenados.sort(new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {


                return Double.compare(p1.getPrice(), p2.getPrice());
            }
        });

        return productosOrdenados;
    }

    public ArrayList<Product> productsBySales(ArrayList<Product> L)
    {
        return L;
    }
    public void addOrder(Order order)
    {
        Q.offer(order);
    }
    public Order processOrder()
    {
        return Q.poll();
    }
    public ArrayList<Order> ordersByUser(String userId)
    {
        Queue<Order> Us = Q;
        ArrayList<Order> e = null;
        int i = 0;
        while(i < Q.size())
        {
            Order o = Us.poll();
            if(o.user == userId)
            {
                e.add(o);
            }
            i++;

        }
        return e;
    }

    public void addUser(String s, String name, String surname)
    {
        User nuevo = new User(s,name,surname);
        H.put(nuevo.s,nuevo);


    }
    public void addProduct(String productId, String name, double price)
    {
        Product p = new Product(productId,name,price);
        L.add(p);
    }
}
