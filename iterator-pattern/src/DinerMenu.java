public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    private final MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("BLT for vegetarian", "Wheat bread with (vegetarian) bacon, lettuce, tomato", true, 2.99);
        addItem("BLT", "Wheat bread with bacon, lettuce, tomato", false, 2.99);
        addItem("Today's soup", "Today's soup with potato salad", false, 3.29);
        addItem("Hotdog", "Hotdog with sauerkraut sauce, sauces, onion, cheese", false, 3.05);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems > MAX_ITEMS) {
            System.err.println("Sorry, the number of menu exceeds max items");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    // Use Iterator instead
/*    public MenuItem[] getMenuItems() {
        return menuItems;
    }*/

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
