// Assosiation between classes.

class Department{
  String DepartmentName;
  String Building;

Department(String DepartmentName, String Building){
  this.DepartmentName = DepartmentName;
  this.Building = Building;
}
void display(){
  System.out.println("Department : " + DepartmentName);
  System.out.println("Building : " + Building);
}
}

class Teacher{
  String name;
  Department department;  // making an assosiation, especially has a relationship
  
  Teacher(String name, Department department){
     this.name = name;
     this.department = department; 
  }
  void showTeachersInfo{
    System.out.println("Teacherr's name : " + name);
    department.display();
  }
}

public class 
