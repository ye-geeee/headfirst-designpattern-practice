public class GreekPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public String createDough() {
        return "Extra Thick Crust Dough";
    }

    @Override
    public String createSauce() {
        return "Plum Tomato Sauce";
    }

    @Override
    public String createCheese() {
        return "Shredded Mazzarella Cheese";
    }

    @Override
    public String[] createVeggies() {
        String[] veggies = {"garlic", "onion", "mushroom"};
        return veggies;
    }

    @Override
    public String createPepperoni() {
        return "dry pepperoni";
    }
}
