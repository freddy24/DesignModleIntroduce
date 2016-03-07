package freddy.com.designmodle.decorator;

/**
 * Description:
 * Created by freddy on 16/3/7.
 */
public class Test {

    public static void main(String[] args){
        //John want a cup of Espresso
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        //John want Espresso with double mocha and milk
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription() + "$" + beverage.cost());

    }
}
