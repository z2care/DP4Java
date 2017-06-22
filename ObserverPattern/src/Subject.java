import java.util.Vector;

public abstract class Subject {
    
    private Vector<IObserver> m_obs = new Vector<IObserver>();

    public void addObserver(IObserver obs){
        this.m_obs.add(obs);
    }
    
    public void delObserver(IObserver obs){
        this.m_obs.remove(obs);
    }
    
    protected void notifyObserver(){
        for(IObserver o:m_obs){
            o.handle();
        }
    }
    
    public abstract void doAction();

}
