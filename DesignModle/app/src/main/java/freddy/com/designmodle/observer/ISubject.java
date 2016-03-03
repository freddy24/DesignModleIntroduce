package freddy.com.designmodle.observer;

/**
 * @author :freddy
 * @Description : subject interface.
 * @date: 2016/3/3
 */
public interface ISubject {

    void registerObserver(IObserver o);

    void removeObserver(IObserver o);

    void notifyObservers();
}
