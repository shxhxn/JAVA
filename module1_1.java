// Define class and object. Explain the relationship between them with a
// suitable Java program that creates multiple objects from a class.

class Student{
  String name;
  int roll_number;
  double marks;


  void display(){
    System.out.println("Name : " + name);
    System.out.println("Roll Number : " + roll_number);
    System.out.println("Marks : " + marks);
  }
}

public class module1_1{
  public static void main(String[] args) {
      
      Student s1 = new Student();
      s1.name = "Shahan";
      s1.roll_number = 44;
      s1.marks = 100;

      s1.display();
  }
}

