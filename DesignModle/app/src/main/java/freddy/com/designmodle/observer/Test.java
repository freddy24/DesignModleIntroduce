package freddy.com.designmodle.observer;

/**
 * @author :freddy
 * @Description :
 * @date : 2016/3/3
 */
public class Test {

    public static void main(String[] args){
        ConcreteObserver observer = new ConcreteObserver();
        ConcreteObserver2 observer2 = new ConcreteObserver2();
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(observer);
        subject.registerObserver(observer2);
        //subject changed, all observers changed. but sometimes, some of the observers don't want all things changed,
        //they just concern what they interesting, what should we do?
        subject.somethingChanged();
        System.out.println("**********************************");
        subject.removeObserver(observer2);
        subject.somethingChanged();
        System.out.println("**********************************");

        //observer pull data they want
        John john = new John();
        Laura laura = new Laura();
        NewspaperOffice newspaperOffice = new NewspaperOffice();
        newspaperOffice.registerObserver(john);
        newspaperOffice.registerObserver(laura);
        newspaperOffice.sendNewspaper();//john and laura get what they like
        System.out.println("**********************************");
        newspaperOffice.removeObserver(john);
        newspaperOffice.sendNewspaper();
    }

}
