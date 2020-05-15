package singleton.model;

public final class Connector {
  private String connectionString;
  private static Connector connector;

  private Connector() {
    this.connectionString = "Some Computed Value " + Math.random();
  }

  public static Connector getInstance() {
    if (connector == null) {
      connector = new Connector();
      return connector;
    } else {
      return connector;
    }
  }

  public String getConnectionString() {
    return connectionString;
  }
}