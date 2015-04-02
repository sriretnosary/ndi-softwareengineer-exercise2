package sg.ndi.exercise.e2;

public class HelloGreeting {

  public String key;

  public String message;

  public HelloGreeting() {};

  public HelloGreeting(String key, String message) {
    this.key = key;
    this.message = message;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
