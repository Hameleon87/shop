import java.util.HashSet;

public class MainShop {
    public static void main(String[] args) throws NotItemsException, NotOrdersException {
        Category alcohol = new Category("Alcohol");
        Category low_alcohol = new Category("low alcohol");
        Item item1 = new Item("Beer", "10/11/2015", alcohol);
        Customer customer = new Customer("Vova");
        Order order1 = new Order(customer, item1, 1);
        Order order2 = new Order(new Customer("Shket"), item1, 2);

        order1.addItem(new Item("Whisky", "10/05/2020", alcohol));
        order1.addItem(new Item("Rom", "10/12/2020", alcohol));
        order1.addItem(new Item("Boots", "10/12/2020", new Category("Shoes")));

        item1.changeCategory(low_alcohol);
        item1.changeCategory(low_alcohol);

        customer.addOrder(new Order(customer, item1, 3));
        customer.addOrder(order2);

        customer.showOrders();
        customer.showOrders();

        Item.itemsList();
    }
}