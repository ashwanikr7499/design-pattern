package abstractFactoryDesignPattern;

import abstractFactoryDesignPattern.factory.CarFactory;
import abstractFactoryDesignPattern.model.Car;
import java.util.Scanner;

public class MainClass {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter car type and location");
    String type,location;
    type=sc.next();
    location=sc.next();
    Car car= CarFactory.getCar(location,type);
    car.show();
  }
}
