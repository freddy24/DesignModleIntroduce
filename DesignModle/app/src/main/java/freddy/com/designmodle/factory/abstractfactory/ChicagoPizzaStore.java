package freddy.com.designmodle.factory.abstractfactory;

/**
 * Description:
 * Created by freddy on 16/5/15.
 */
public class ChicagoPizzaStore implements PizzaStore {
    @Override
    public Pizza createPizza(String style) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoIngredientFactory();
        if (style.equals("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
        }else if (style.equals("dough")){
            pizza = new DoughPizza(pizzaIngredientFactory);
        }
        return pizza;
    }
}
