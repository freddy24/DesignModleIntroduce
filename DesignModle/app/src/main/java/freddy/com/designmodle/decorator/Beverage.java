package freddy.com.designmodle.decorator;

/**
 * Description:
 * Created by freddy on 16/3/7.
 */
public abstract class Beverage {

    public String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
