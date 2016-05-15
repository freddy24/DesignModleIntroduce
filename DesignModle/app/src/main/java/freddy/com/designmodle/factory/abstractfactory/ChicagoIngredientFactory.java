package freddy.com.designmodle.factory.abstractfactory;

import freddy.com.designmodle.factory.abstractfactory.cheese.Cheese;
import freddy.com.designmodle.factory.abstractfactory.cheese.ChicagoCheese;
import freddy.com.designmodle.factory.abstractfactory.dough.ChicagoDough;
import freddy.com.designmodle.factory.abstractfactory.dough.Dough;

/**
 * Description:
 * Created by freddy on 16/5/15.
 */
public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ChicagoDough();
    }

    @Override
    public Cheese createCheese() {
        return new ChicagoCheese();
    }
}
