import java.util.HashSet;

public class ItemCustomer {
    protected String name;
    protected HashSet<Order> orders = new HashSet<Order>();

    public ItemCustomer(String name) {
        this.name = name;
    }

    // public String getName() {
    //     return this.name;
    // }

    public void addOrder(Order newOrder) {
        this.orders.add(newOrder);
    }
    public void removeOrder(Order oldOrder) {
        this.orders.remove(oldOrder);
    }
    public void showOrders() throws NotOrdersException{
        if ( orders.isEmpty() ) {
            throw new NotOrdersException();
        }
        for( Order order : orders ) {
            System.out.println(order);
        }
    }

}