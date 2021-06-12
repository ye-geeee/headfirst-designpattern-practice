import java.util.ArrayList;

public class PancakeHouseMenu {
    private final ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("K&B pancake set", "pancake with scrambled egg and toast", true, 2.99);
        addItem("regular pancake set", "pancake with egg and sausage", false, 2.99);
        addItem("blueberry pancake", "pancake with fresh blueberry and blueberry syrup", true, 3.49);
        addItem("waffle", "waffle with strawberry of blueberry", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

/*    public ArrayList getMenuItems() {
        return menuItems;
    }*/

    public Iterator createItertor() {
        return new PancakeIterator(menuItems);
    }
}
