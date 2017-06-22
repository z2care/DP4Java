
public class ConcreteObserver implements IObserver {

    @Override
    public void handle() {
        System.out.println("ConcreteObserver handle message");
    }

}
