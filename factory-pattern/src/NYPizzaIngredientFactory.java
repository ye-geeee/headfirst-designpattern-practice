public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String createDough() {
        return "This Crust Dough";
    }

    @Override
    public String createSauce() {
        return "Marinara Sauce";
    }

    @Override
    public String createCheese() {
        return "Reggiano Cheese";
    }

    @Override
    public String[] createVeggies() {
        String[] veggies = {"garlic", "onion", "mushroom", "red pepper"};
        return veggies;
    }

    @Override
    public String createPepperoni() {
        return "sliced pepperoni";
    }
}
