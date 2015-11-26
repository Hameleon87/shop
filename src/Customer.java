import java.util.HashSet;

public class Customer extends ItemCustomer {
    protected static HashSet<Customer> listCustomer = new HashSet<Customer>();

    public Customer(String name) {
        super(name);
        listCustomer.add(this);
    }

    public static void customerList() {
        for( Customer customer : listCustomer ) {
            System.out.println(customer);
        }
    }
    public String toString() {
        StringBuffer out = new StringBuffer();

        out.append("Name customer " + name);

        return out.toString();
    }
}