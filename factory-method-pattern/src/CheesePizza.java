class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "CheesePizza";
    }
}

class ChicacoStyleCheesePizza extends CheesePizza {
    public ChicacoStyleCheesePizza() {
        name = "ChicacoStyleCheesePizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }
}

class NYStyleCheesePizza extends CheesePizza {
    public NYStyleCheesePizza() {
        name = "NYStyleCheesePizza";
        dough = "This Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}