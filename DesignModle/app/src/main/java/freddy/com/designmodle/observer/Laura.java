package freddy.com.designmodle.observer;

/**
 * @author :freddy
 * @Description : Laura is a observer
 * @date : 2016/3/3
 */
public class Laura implements IPullObserver {

    private String entertainmentNews;
    @Override
    public void update(NewspaperOffice subject) {
        entertainmentNews = subject.getEntertainmentNews();
        display();
    }

    private void display(){
        System.out.println("Laura like " + entertainmentNews);
    }
}
