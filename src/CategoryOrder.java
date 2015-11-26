import java.util.HashSet;

public class CategoryOrder {
    protected HashSet<Item> items = new HashSet<Item>();

    public CategoryOrder() {}

    public void addItem(Item newItem) {
        this.items.add(newItem);
    }
    public void removeItem(Item oldItem) throws NotItemsException {
        if ( this.items.isEmpty() ) {
            throw new NotItemsException();
        }
         this.items.remove(oldItem);
    }
    public void showItems() throws NotItemsException {
        if ( items.isEmpty() ) {
            throw new NotItemsException();
        }
        for( Item item : items ) {
            System.out.println(items);
        }
    }

}