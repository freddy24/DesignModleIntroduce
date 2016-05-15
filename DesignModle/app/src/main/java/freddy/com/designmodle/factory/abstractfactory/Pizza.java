package freddy.com.designmodle.factory.abstractfactory;

import freddy.com.designmodle.factory.abstractfactory.cheese.Cheese;
import freddy.com.designmodle.factory.abstractfactory.dough.Dough;

/**
 * Description:
 * Created by freddy on 16/5/15.
 */
public abstract class Pizza {

    String name;

    Dough dough;

    Cheese cheese;

    abstract void prepare();

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
