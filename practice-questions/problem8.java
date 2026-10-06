class student{
        String name;
        int roll;
        double marks;
      void display(){
        System.out.println("The name of the student : " + name);
        System.out.println("The roll of the student : " + roll);
        System.out.println("The marks of the student : " + marks + "\n");
      }
      }

public class problem8{
  public static void main(String[] args) {
     
     student s1 = new student();
     s1.name = "Shahan";
     s1.roll = 044;
     s1.marks = 99;


     student s2 = new student();
     s2.name = "hjshf";
     s2.roll = 67;
     s2.marks = 99;

     s1.display();
     
     s2.display();
  }
}