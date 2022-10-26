package builderDesignPattern;

public class MainClass {

  public static void main(String[] args) {
    Computer computer=new ComputerBuilder("1TB","8GB").addBluetooth(true).build();
    computer.show();
    new ComputerBuilder("2TB","16GB").addGraphics(false).addBluetooth(true).build().show();

  }

}
