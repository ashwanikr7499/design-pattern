package abstractFactoryDesignPattern.model;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
public class Car {

  String model;
  String location;
  Car(String model,String location)
  {
    this.model=model;
    this.location=location;
  }
  public void show()
  {
    System.out.println("Model="+model+" Location="+location);
  }
}
