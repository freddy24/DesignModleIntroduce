package freddy.com.designmodle.observer;

/**
 * @author :freddy
 * @Description : John is a observer
 * @date : 2016/3/3
 */
public class John implements IPullObserver{

    private String socialNews;


    @Override
    public void update(NewspaperOffice subject) {
        this.socialNews = subject.getSocialNews();
        display();
    }

    private void display(){
        System.out.println("john like " + socialNews);
    }
}