
public class Client {

    public static void main(String[] args) {
        Subject sub = new ConcreteSubject();
        sub.addObserver(new ConcreteObserver());
        sub.doAction();
    }

}
