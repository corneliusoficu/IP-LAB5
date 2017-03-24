public class CataclismDetector extends NotificationManager {

  public static void main(String[] args) {
    NotificationManager manager=new NotificationManager();
    Observer obs1=new Cetatean();
    Observer obs2=new ServiciuDeUrgenta();
    manager.attach(obs1);
    manager.attach(obs2);
    manager.setCataclism(new Cataclism());
    manager.notifyAllObservers();

  }

}