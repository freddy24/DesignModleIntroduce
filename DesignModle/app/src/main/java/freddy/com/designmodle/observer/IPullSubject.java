package freddy.com.designmodle.observer;

/**
 * @author :freddy
 * @Description :
 * @date : 2016/3/3
 */
public interface IPullSubject {

    void registerObserver(IPullObserver o);

    void removeObserver(IPullObserver o);

    void notifyObservers();
}
