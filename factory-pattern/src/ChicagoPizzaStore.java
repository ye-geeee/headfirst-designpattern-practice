public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new GreekPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Greek Style Cheese Pizza");
        } else if (type.equals("greek")) {
            pizza = new GreekPizza(pizzaIngredientFactory);
            pizza.setName("Greek Style Greek Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("Greek Style Pepperoni Pizza");
        }

        return pizza;
    }
}
