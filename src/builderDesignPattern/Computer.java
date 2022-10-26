package builderDesignPattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Computer {

  //required params
  private String hdd;
  private String ram;

  //optional params
  private Boolean isGraphicsCardEnabled;
  private Boolean isBluetoothEnabled;

  public void show() {
    System.out.println(
        "hdd=" + hdd + ", ram=" + ram + ", graphics=" + isGraphicsCardEnabled + ", bluetooth="
            + isBluetoothEnabled);
  }


}
