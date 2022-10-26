package compositeDesignPattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SalesDepartment implements Department{
  String name = null;
  String id = null;
  @Override
  public void printDepartment() {
    System.out.println(getClass().getName());
  }
}
