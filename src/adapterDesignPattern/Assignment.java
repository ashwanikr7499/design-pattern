package adapterDesignPattern;

import lombok.Getter;
import lombok.Setter;

public class Assignment {
@Getter@Setter
  private Pen p;
public void writeAssignment(String text)
{
  p.write(text);
}
}
