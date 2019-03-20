// class that implement the interface and must have the interface methods
public class DeskPhone implements ITelephone {
  private int myNumber;
  private boolean isRinging;

  public DeskPhone(int number) {
    myNumber = number;
  }

  @Override
  public void powerOn() {
    System.out.println("This phone has no power button");
  }

  @Override
  public void dial(int phoneNumber) {
    System.out.println("Now ringing " + phoneNumber);
  }

  @Override
  public void answer() {
    if (isRinging) {
      System.out.println("Answering desk phone");
      isRinging = false;
    }
  }

  @Override
  public boolean callPhone(int phoneNumber) {
    if (phoneNumber == myNumber) {
      isRinging = true;
      System.out.println("Ring Ring");
    } else {
      isRinging = false;
    }
    return isRinging;
  }

  @Override
  public boolean isRinging() {
    return isRinging;
  }

}