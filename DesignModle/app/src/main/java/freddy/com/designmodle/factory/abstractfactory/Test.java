package freddy.com.designmodle.factory.abstractfactory;

/**
 * Description:
 * Created by freddy on 16/5/15.
 */
public class Test {

    public static void main(String[] args){
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyPizza = nyPizzaStore.createPizza("cheese");
        nyPizza.prepare();
        Pizza nyDoughPizza = nyPizzaStore.createPizza("dough");
        nyDoughPizza.prepare();
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoCheese = chicagoPizzaStore.createPizza("cheese");
        chicagoCheese.prepare();
        Pizza chicagoDough = chicagoPizzaStore.createPizza("dough");
        chicagoDough.prepare();
    }
}
