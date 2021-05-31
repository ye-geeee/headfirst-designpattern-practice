public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicacoStyleCheesePizza();
        } else if (type.equals("greek")) {
            return new ChicagoStyleGreekPizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
