package abstractFactoryDesignPattern.factory;

import abstractFactoryDesignPattern.model.Car;
import abstractFactoryDesignPattern.model.LuxuryCar;
import abstractFactoryDesignPattern.model.MiniCar;

public class USACarFactory {
  public static Car getUSACar(String type)
  {
    if (type.equalsIgnoreCase("mini"))
      return new MiniCar("USA");
    else if(type.equalsIgnoreCase("luxury"))
      return new LuxuryCar("USA");
    else return null;
  }


}
