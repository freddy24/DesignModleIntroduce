package freddy.com.designmodle.decorator;

/**
 * Description:
 * Created by freddy on 16/3/7.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",MoCha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
