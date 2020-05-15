package singleton.model;

public final class Connector {
  private String connectionString;
  private static Connector connector;

  private Connector() {
    this.connectionString = "Some Computed Value " + Math.random();
  }

  /**
   * The “synchronized” keyword is used.
   * So, multiple threads cannot involve in the instantiation process at the same time.
   * Forcing each thread to wait its turn to get the method, so thread- safety is ensured
   * <p>
   * But synchronization is a costly operation and once the instance is created,
   * it is an additional overhead
   **/
  public static synchronized Connector getInstance() {
    /**Consider the following case. Suppose, in a multithreaded environment, two (or more) threads try to evaluate this:
     if (captain == null)
     And if they see that the instance is not created yet,
     each of them will try to create a new instance. As a result, you may end up with multiple instances of the class.**/
    // Lazy initialization
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
/**
 * Why did you use the term lazy initialization in the code?
 * Because the singleton instance will not be created until the getCaptain() method is called here.
 **/