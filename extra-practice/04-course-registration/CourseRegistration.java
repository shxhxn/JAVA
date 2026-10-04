class CourseStudent {
  int studentid;
  String name;
  String department;
  String course;

CourseStudent(int studentid, String name, String department, String course){
  this.studentid = studentid;
  this.name = name;
  this.department = department;
  this.course = course;
}

void display(){
  System.out.println("Id : " + studentid);
  System.out.println("Name : " + name);
  System.out.println("Department :" + department);
  System.out.println("Course : " + course);
}
}


public class CourseRegistration {
  public static void main(String[] args){
    CourseStudent s1 = new CourseStudent(101, "Rahul", "CSE" , "Java");
    CourseStudent s2 = new CourseStudent(102, "Priya" , "CSE" , "Python");
    CourseStudent s3 = new CourseStudent(103, "Anany" , "CSBS" , "Vibe coding");

    s1.display();
    s2.display();
    s3.display();
  }
}
