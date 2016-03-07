package freddy.com.designmodle.decorator;

/**
 * Description:
 * Created by freddy on 16/3/7.
 */
public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.99;
    }
}
