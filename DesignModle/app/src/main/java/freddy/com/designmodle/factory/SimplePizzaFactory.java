package freddy.com.designmodle.factory;

import freddy.com.designmodle.factory.bean.CheesePizza;
import freddy.com.designmodle.factory.bean.ClamPizza;
import freddy.com.designmodle.factory.bean.Pizza;
import freddy.com.designmodle.factory.bean.VeggiePizza;

/**
 * Description:
 * Created by freddy on 16/5/11.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("clam")){
            pizza = new ClamPizza();
        }else if (type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
