public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast Menu");
        MenuComponent dinerMenu = new Menu("Object House Menu", "Lunch Menu");
        MenuComponent cafeMenu = new Menu("Cafe Menu", "Dinner Menu");
        MenuComponent dessertMenu = new Menu("Dessert Menu", "Enjoy your dessert!");

        MenuComponent allMenus = new Menu("All Menu", "All Menu!");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Pasta", "Mariana Sauce Sphagetti", true, 3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple pie", "Applie pie with crust and vanila ice cream", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
