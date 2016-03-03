package freddy.com.designmodle.observer;

/**
 * @author :freddy
 * @Description :
 * @date : 2016/3/3
 */
public class ConcreteObserver2 implements IObserver{

    @Override
    public void update() {
        System.out.println("observer2 update");
    }
}
