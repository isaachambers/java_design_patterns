package prototype;

import java.util.Random;

public abstract class BasicCar implements Cloneable {

  public String modelName;
  public int basePrice, onRoadPrice;

  public String getModelname() {
    return modelName;
  }

  public void setModelname(String modelname) {
    this.modelName = modelname;
  }

  public static int setAdditionalPrice() {
    int price = 0;
    Random r = new Random();
    int p = r.nextInt(100000);
    price = p;
    return price;
  }


  @Override
  protected BasicCar clone() throws CloneNotSupportedException {
    return (BasicCar) super.clone();
  }
}