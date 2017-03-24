public class Cetatean extends Observer {

  public String mail;

  public void notifyMe() {
    System.out.println("A fost notificat cetateanul de cataclismul "+getSubject().getCataclism().getDescription());
  }

}