import java.util.Vector;

public abstract class Observer {

    private NotificationManager Subject;
    public abstract void notifyMe();

  public NotificationManager getSubject() {
    return Subject;
  }

  public void setSubject(NotificationManager subject) {
    Subject = subject;
  }
}