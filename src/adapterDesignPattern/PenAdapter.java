package adapterDesignPattern;

public class PenAdapter implements Pen{

  BallPen ballPen=new BallPen();
  @Override
  public void write(String text) {

    ballPen.write(text);
  }
}
