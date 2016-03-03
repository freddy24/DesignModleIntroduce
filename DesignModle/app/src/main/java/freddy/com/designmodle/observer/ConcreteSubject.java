package freddy.com.designmodle.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :freddy
 * @Description : concrete subject is the observed ,it one to many.
 * @date : 2016/3/3
 */
public class ConcreteSubject implements ISubject{

    private List<IObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }

    public void somethingChanged(){
        notifyObservers();
    }
}
