import java.util.HashSet;

public class Order extends CategoryOrder {
    protected int orderId;
    protected Customer owner;

    protected static HashSet<Order> listOrder = new HashSet<Order>();

    public Order(Customer owner, Item item, int orderId) {
        this.owner = owner;
        this.owner.addOrder(this);
        this.orderId = orderId;
        addItem(item);
        item.addOrder(this);

        listOrder.add(this);
    }

    public int getOrderId() {
        return this.orderId;
    }
    public Customer getOwner() {
        return this.owner;
    }

    public static void orderList() {
        for( Order order : listOrder ) {
            System.out.println(order);
        }
    }
    public String toString() {
        StringBuffer out = new StringBuffer();

        out.append(owner + " has order id: " + orderId);

        return out.toString();
    }
}