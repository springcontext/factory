import model.Pizza;
import model.PizzaFactory;

public class Main {

    public static void main(String args[]) {

        PizzaFactory pizzaFactory = PizzaFactory.getInstance();

        Pizza hawaiian = pizzaFactory.createHawaiian();
        Pizza margherita = pizzaFactory.createMargherita();
        Pizza chicken = pizzaFactory.createChicken();

        System.out.println(hawaiian);
        System.out.println(margherita);
        System.out.println(chicken);
    }
}