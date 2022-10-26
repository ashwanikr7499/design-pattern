package abstractFactoryDesignPattern.model;

import abstractFactoryDesignPattern.model.Car;
import lombok.Getter;

public class LuxuryCar extends Car {
  @Getter
  private String location;
  public LuxuryCar(String location)
  {
    super("Luxury Car", location);
    this.location=location;
  }
}
