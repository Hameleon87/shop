import java.util.HashSet;

public class Item extends ItemCustomer {
    protected String expirationDate;
    protected Category category;

    protected static HashSet<Item> listItems = new HashSet<Item>();

    public Item(String name, String expirationDate, Category category) {
        super(name);
        this.expirationDate = expirationDate;
        this.category = category;
        this.category.addItem(this);

        listItems.add(this);
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }
    public Category getCategory() {
        return this.category;
    }

    public void changeCategory(Category newCategory) throws NotItemsException {
        this.category.removeItem(this);
        this.category = newCategory;
        this.category.addItem(this);
    }

    public static void itemsList() {
        for( Item item : listItems ) {
            System.out.println(item);
        }
    }

    public String toString() {
        StringBuffer out = new StringBuffer();

        out.append(name + "-- expiration date is__" + expirationDate);
        out.append(" category: " + category);

        return out.toString();
    }
}
