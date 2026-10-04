class student{
  String name;
  int rollNumber;   // attributes
  double marks;

  void display(){
    System.out.println("Name : " + name);
    System.out.println("RollNumber : " + rollNumber);   // methods
    System.out.println("Marks : " + marks);
  }

}

public class ClassesAndObjects {
    public static void main(String[] args){

    student s1 = new student();   // creating an object named s1
    s1.name = "Shahan";
    s1.rollNumber = 044;
    s1.marks = 99;

    student s2 = new student(); // new thing is basically a constructor,
    s2.name = "someone";
    s2.rollNumber = 38;
    s2.marks = 50;

    s1.display();
    s2.display();

    }
}
