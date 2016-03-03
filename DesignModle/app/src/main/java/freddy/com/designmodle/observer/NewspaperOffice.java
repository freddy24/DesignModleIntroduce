package freddy.com.designmodle.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :freddy
 * @Description :
 * @date : 2016/3/3
 */
public class NewspaperOffice implements IPullSubject{

    private List<IPullObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(IPullObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IPullObserver o) {
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (IPullObserver observer : observers) {
            observer.update(this);
        }
    }

    public String getSocialNews() {
        return "socialNews";
    }

    public String getEntertainmentNews() {
        return "entertainmentNews";
    }

    public void sendNewspaper(){
        notifyObservers();
    }
}
