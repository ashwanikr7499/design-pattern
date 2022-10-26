package abstractFactoryDesignPattern.factory;

import abstractFactoryDesignPattern.model.Car;

public class CarFactory {

  public static Car getCar(String location, String type) {
    if (location.equalsIgnoreCase("india")) {
      if (type.equalsIgnoreCase("mini")) {
        return IndiaCarFactory.getIndianCar("mini");
      } else {
        IndiaCarFactory.getIndianCar("luxury");
      }
    } else if (location.equalsIgnoreCase("usa")) {
      if (type.equalsIgnoreCase("mini")) {
        return USACarFactory.getUSACar("mini");
      } else {
        return USACarFactory.getUSACar("luxury");
      }
    }

    return null;
  }

}
