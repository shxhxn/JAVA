// compile time polymorphism -> method overloading

class Add{
  int add(int a, int b){
    return a + b;
  }
  int add(int a, int b, int c){
    return a + b + c;
  }

  double add(double a, double b){
    return a + b;
  }
}

public class module1_2_compileTimePolymorphism{
  public static void main(String[] args) {
      
      Add a1 = new Add();
      System.out.println(a1.add(34, 67));
      System.out.println(a1.add(67.7, 67.7));
  }
}