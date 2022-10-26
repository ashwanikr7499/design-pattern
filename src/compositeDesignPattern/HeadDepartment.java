package compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department{
  String name = null;
  String id = null;
   List<Department> childDepartments;
   HeadDepartment(String id,String name)
   {
     this.id=id;
     this.name=name;
     childDepartments=new ArrayList<>();
   }
  public void printDepartmentName() {
    childDepartments.forEach(Department::printDepartment);
  }

  public void addDepartment(Department department) {
    childDepartments.add(department);
  }

  public void removeDepartment(Department department) {
    childDepartments.remove(department);
  }
  @Override
  public void printDepartment() {

  }
}
