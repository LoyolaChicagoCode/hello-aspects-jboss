package helloworld;

public class HelloWorld implements Hello {

  private String msg;
  
  public void setMessage(String msg) {
    this.msg = msg;
  }

  public String getMessage() {
    return msg + " " + getOne();
  }
  
  public int getOne() {
  	return 1;
  }
}
