package freddy.com.designmodle.factory.abstractfactory;

import freddy.com.designmodle.factory.abstractfactory.cheese.Cheese;
import freddy.com.designmodle.factory.abstractfactory.cheese.NYCheese;
import freddy.com.designmodle.factory.abstractfactory.dough.Dough;
import freddy.com.designmodle.factory.abstractfactory.dough.NYDough;

/**
 * Description:
 * Created by freddy on 16/5/15.
 */
public class NYIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new NYDough();
    }

    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }
}
