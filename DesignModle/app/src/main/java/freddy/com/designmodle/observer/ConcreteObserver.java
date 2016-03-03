package freddy.com.designmodle.observer;

/**
 * @author :freddy
 * @Description :
 * @date : 2016/3/3
 */
public class ConcreteObserver implements IObserver {
    @Override
    public void update() {
        //do things when the observed changed
        System.out.println("observer update");
    }
}
