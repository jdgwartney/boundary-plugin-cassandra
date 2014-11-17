package com.boundary.plugin.jmx;

public class Example implements ExampleMBean {

  private String message = null;

  public Example()
  {
     this.message = "Hello World! I am a Standard MBean";
  }

  public Example(String message)
  {
    this.message = message;
  }

  public void setMessage(String message )
  {
    this.message = message;
  }

  public String getMessage()
  {
    return message;
  }

  public void printMessage()
  {
    System.out.println(message);
  }
}
