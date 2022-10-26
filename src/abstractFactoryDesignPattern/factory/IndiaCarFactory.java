package abstractFactoryDesignPattern.factory;

import abstractFactoryDesignPattern.model.Car;
import abstractFactoryDesignPattern.model.LuxuryCar;
import abstractFactoryDesignPattern.model.MiniCar;

public class IndiaCarFactory {
  public static Car getIndianCar(String type)
  {
     if (type.equalsIgnoreCase("mini"))
       return new MiniCar("India");
     else if(type.equalsIgnoreCase("luxury"))
       return new LuxuryCar("India");
     else return null;
  }

}
