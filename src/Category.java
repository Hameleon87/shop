import java.util.HashSet;

public class Category extends CategoryOrder {
    protected String name;

    protected static HashSet<Category> listCategories = new HashSet<Category>();

    public Category(String name) {
        this.name = name;
     
        listCategories.add(this);
    }

    public String getName() {
        return this.name;
    }

    public static void categoriesList() {
        for( Category category : listCategories ) {
            System.out.println(category);
        }
    } 
    public String toString() {
        StringBuffer out = new StringBuffer();

        out.append("Name category " + name);

        return out.toString();
    }
}
