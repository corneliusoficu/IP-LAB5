public class Cataclism {

  private String description;

  private String details;

  private int urgency;

  public Cataclism() {
    description="Cutremur de 7.7 grade in Vrancea";
  }

  public String getDescription() {
    return description;
  }

  public String getDetails() {
    return details;
  }

  public int getUrgency() {
    return urgency;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public void setUrgency(int urgency) {
    urgency = urgency;
  }
}