class ConstructorStudent {
 String name;
 int rollNumber;


 // constructor
 ConstructorStudent(String n, int r) {
 name = n;                    // this is what happens in the compiler.
 rollNumber = r;
 }
}

public class Constructors{
  public static void main(String[] args) {

// Usage:
ConstructorStudent s1 = new ConstructorStudent("Anita", 101);    // new calls the constructor
  }
}
