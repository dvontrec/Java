// Creates a new ITelephone interface
// Classes that implemtnt interface must follow the pattern
public interface ITelephone {
  // creates method signatures
  void powerOn();

  void dial(int phoneNumber);

  void answer();

  boolean callPhone(int phoneNumber);

  boolean isRinging();
}

// code is not writen in the interface. Objects that use this interface must
// implement these methods