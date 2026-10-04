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

