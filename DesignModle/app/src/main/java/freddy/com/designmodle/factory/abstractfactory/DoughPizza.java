package freddy.com.designmodle.factory.abstractfactory;

/**
 * Description:
 * Created by freddy on 16/5/15.
 */
public class DoughPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public DoughPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = new ChicagoIngredientFactory();
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
    }
}
