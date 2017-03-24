public class ServiciuDeUrgenta extends Observer {

  public Integer newAttr;

  public void notifyMe() {
    System.out.println("A fost notificat serviciul de urgenta de cataclismul "+getSubject().getCataclism().getDescription());
  }

}