package abstractFactoryDesignPattern.model;

import abstractFactoryDesignPattern.model.Car;
import lombok.Getter;

public class MiniCar extends Car {
  @Getter
  private String location;
  public MiniCar(String location)
  {
    super("MiniCar",location);
    this.location=location;
  }

}
