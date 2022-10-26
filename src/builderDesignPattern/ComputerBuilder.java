package builderDesignPattern;

public class ComputerBuilder extends Computer{

  ComputerBuilder(String hdd, String ram)
  {
    this.setHdd(hdd);
    this.setRam(ram);
  }
  public ComputerBuilder addGraphics(Boolean isGraphicsCardEnabled)
  {
    this.setIsGraphicsCardEnabled(isGraphicsCardEnabled);
    return this;
  }
  public ComputerBuilder addBluetooth(Boolean isBluetoothEnabled)
  {
    this.setIsBluetoothEnabled(isBluetoothEnabled);
    return this;
  }
  public Computer build()
  {
    Computer computer=new Computer();
    computer.setHdd(this.getHdd());
    computer.setRam(this.getRam());
    computer.setIsGraphicsCardEnabled(this.getIsGraphicsCardEnabled());
    computer.setIsBluetoothEnabled(this.getIsBluetoothEnabled());
    return computer;
  }

}
