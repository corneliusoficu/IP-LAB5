import java.util.List;
import java.util.Vector;

public class NotificationManager {



  private List<Observer> observers;

  private Cataclism cataclism;

  public Cataclism getCataclism() {
  return cataclism;
  }

  public void setState( Cataclism cataclism) {
    this.cataclism = cataclism;
  }

  public void attach( Observer observer) {
    observers.add(observer);
  }

  public void notifyAllObservers() {
    for(Observer observer : observers){
      observer.notify();
    }
  }

}