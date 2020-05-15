package singleton;

import singleton.model.Connector;

/**
 * A class cannot have multiple instances. Once created, the next time onward, you use only the existing instance.
 * This approach helps you restrict unnecessary object creations in a centralized system.
 * The approach also promotes easy maintenance.
 **/
public class SingletonPattern {


  //the output will be the same
  public static void main(String[] args) {

    System.out.println(Connector.getInstance().getConnectionString());
    System.out.println(Connector.getInstance().getConnectionString());
    System.out.println(Connector.getInstance().getConnectionString());
    System.out.println(Connector.getInstance().getConnectionString());

  }
}
