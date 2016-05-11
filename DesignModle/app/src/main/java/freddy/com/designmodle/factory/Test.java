package freddy.com.designmodle.factory;

import freddy.com.designmodle.factory.bean.Pizza;

/**
 * Description:
 * Created by freddy on 16/5/11.
 */
public class Test {


    public static void main(String[] args){
        SimplePizzaFactory factory = new SimplePizzaFactory();
        Pizza pizza = factory.createPizza("cheese");
        pizza.prepare();
    }
}
