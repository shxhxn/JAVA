class shape {    
  void draw(){
    System.out.println("Drawing a generic shape.");
  }
}

class square extends shape{
  @Override
  void draw(){
    System.out.println("Drawing a square.");
  }
}

class rectangle extends shape{
  @Override
  void draw(){
     System.out.println("Drawing a rectangle.");
  }
}

public class RunTimePolymorphism{
  public static void main(String [] args){
    rectangle r1 = new rectangle();
    r1.draw();

    square s1 = new square();
    s1.draw();
  }
}

// This occurs when a subclass provides its own specific implementation of a method that is already defined in its
//parent class. The method that gets called is determined at run time, based on the actual object type, not the reference
//type. This is achieved through method overriding and requires inheritance.
