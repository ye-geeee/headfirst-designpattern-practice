public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicacoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("pizza : " + pizza.getName());

        pizza = chicacoStore.orderPizza("cheese");
        System.out.println("pizza : " + pizza.getName());
    }
}
