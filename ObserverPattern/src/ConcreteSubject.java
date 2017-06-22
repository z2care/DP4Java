
public class ConcreteSubject extends Subject {

    @Override
    public void doAction() {
        System.out.println("ConcreteSubject do action");
        this.notifyObserver();
    }

}
