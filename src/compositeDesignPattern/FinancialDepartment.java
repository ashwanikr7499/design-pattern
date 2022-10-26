package compositeDesignPattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FinancialDepartment implements Department{
  String name = null;
  String id = null;
  @Override
  public void printDepartment() {
    System.out.println(getClass().getName());
  }
}
