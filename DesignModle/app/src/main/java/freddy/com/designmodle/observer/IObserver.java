package freddy.com.designmodle.observer;

/**
 * @author :freddy
 * @Description :
 * @date : 2016/3/3
 */
public interface IObserver {
    /**
     * when the subject changed, observer should know
     */
    void update();
}
