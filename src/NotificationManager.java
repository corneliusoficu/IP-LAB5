import java.util.ArrayList;
import java.util.List;

public class NotificationManager {

  private List<Observer> observers;
  private Cataclism cataclism;

  public NotificationManager() {
    observers=new ArrayList<>();
  }

  public Cataclism getCataclism() {
  return cataclism;
  }

  public void setCataclism( Cataclism cataclism) {
    this.cataclism = cataclism;
  }

  public void attach( Observer observer) {
    observers.add(observer);
    observer.setSubject(this);
  }

  public void notifyAllObservers() {
    for(Observer observer : observers){
      observer.notifyMe();
    }
  }

}