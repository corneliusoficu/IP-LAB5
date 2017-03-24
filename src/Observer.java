import java.util.Vector;

public abstract class Observer {

    private NotificationManager subject;
    public abstract void notifyMe();

  public NotificationManager getSubject() {
    return subject;
  }

  public void setSubject(NotificationManager subject) {
    subject = subject;
  }
}