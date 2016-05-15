package freddy.com.designmodle.factory.abstractfactory;

/**
 * Description:
 * Created by freddy on 16/5/15.
 */
public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = new NYIngredientFactory();
    }
    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
    }
}
