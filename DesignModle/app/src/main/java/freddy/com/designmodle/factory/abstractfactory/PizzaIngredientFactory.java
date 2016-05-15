package freddy.com.designmodle.factory.abstractfactory;

import freddy.com.designmodle.factory.abstractfactory.cheese.Cheese;
import freddy.com.designmodle.factory.abstractfactory.dough.Dough;

/**
 * Description:
 * Created by freddy on 16/5/15.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Cheese createCheese();
}
