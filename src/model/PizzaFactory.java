package model;

public class PizzaFactory {

    private static PizzaFactory INSTANCE = null;

    private PizzaFactory() {

    }

    public static PizzaFactory getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new PizzaFactory();
        }

        return INSTANCE;
    }

    public Pizza createHawaiian() {
        Pizza pizza = new Pizza();

        pizza.setCrust("Thin");

        pizza.addGarnish("Tomato sauce");
        pizza.addGarnish("Ham");
        pizza.addGarnish("Pineapple");
        pizza.addGarnish("cheese");

        return pizza;
    }

    public Pizza createMargherita() {
        Pizza pizza = new Pizza();

        pizza.setCrust("Thin");

        pizza.addGarnish("Tomato sauce");
        pizza.addGarnish("Mozzarella");
        pizza.addGarnish("Basil");

        return pizza;
    }

    public Pizza createChicken() {
        Pizza pizza = new Pizza();

        pizza.setCrust("Thin");

        pizza.addGarnish("Tomato sauce");
        pizza.addGarnish("Chicken breast");
        pizza.addGarnish("Mozzarella");

        return pizza;
    }
}
