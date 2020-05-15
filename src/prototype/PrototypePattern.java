package prototype;

/**
 * In general, creating a new instance from scratch is a costly operation.
 * Using the prototype pattern, you can create new instances by copying or cloning an instance of an existing one.
 * This approach saves both time and money in creating a new instance from scratch.
 **/

/**
 * What are the advantages of using prototype design patterns?
 * • It is useful when creating an instance of a class is a complicated
 * (or boring) process. Instead, you can focus on other key activities.
 * • You can include or discard products at runtime.
 * • You can create new instances at a cheaper cost.
 * What are the challenges associated with using prototype design patterns?
 * • Each subclass needs to implement the cloning or copying mechanism.
 * • Sometimes creating a copy from an existing instance is not simple.
 *
 * <p>
 * /** What are the challenges associated with using prototype design patterns?
 * • Each subclass needs to implement the cloning or copying mechanism.
 * • Sometimes creating a copy from an existing instance is not simple.
 * For example, implementing a cloning mechanism can be challenging if the objects under
 * consideration do not support copying/cloning or if there are circular references.
 * For example, in Java, a class with the clone() method needs to implement the Cloneable marker interface; otherwise, it will throw a CloneNotSupportedException.
 * • In this example, I have used the clone() method that performs a shallow copy in Java.
 * Following the convention, I obtained the returned object by calling super.clone()
 * .(If you want to learn more about this, put your cursor on the eclipse editor and go through the instructions). If you need a deep copy for your application, that can be expensive
 * .
 * <p>
 * Can you please elaborate the difference between a shallow copy and a deep copy?
 * A shallow copy creates a new object and then copies various field values from the original object to the new object.
 * So, it is also known as a field-by-field copy. If the original object contains any references to other objects as fields,
 * then the references of those objects are copied into the new object, (i.e., you do not create the copies of those objects).
 **/

/**
 Can you please elaborate the difference between a shallow copy and a deep copy?
 A shallow copy creates a new object and then copies various field values from the original object to the new object.
 So, it is also known as a field-by-field copy.If the original object contains any references to other objects as fields,
 then the references of those objects are copied into the new object, (i.e., you do not create the copies of those objects).
 In a deep copy, the new object is totally separated from the original one. Any changes made in one object should not be reflected on the other one.
 **/


public class PrototypePattern {

  public static void main(String[] args) throws CloneNotSupportedException {
    System.out.println("***Prototype Pattern Demo***\n");
    BasicCar nano = new Nano("Green Nano");
    nano.basePrice = 100000;
    BasicCar ford = new Ford("Ford Yellow");
    ford.basePrice = 500000;
    BasicCar bc1;
//Nano
    bc1 = nano.clone();
//Price will be more than 100000 for sure
    bc1.onRoadPrice = nano.basePrice + BasicCar.setAdditionalPrice();
    System.out.println("Car is: " + bc1.modelName + " and it's price is Rs." + bc1.onRoadPrice);
//Ford
    bc1 = ford.clone();
//Price will be more than 500000 for sure
    bc1.onRoadPrice = ford.basePrice + BasicCar.setAdditionalPrice();
    System.out.println("Car is: " + bc1.modelName + " and it's price is Rs." + bc1.onRoadPrice);
  }
}