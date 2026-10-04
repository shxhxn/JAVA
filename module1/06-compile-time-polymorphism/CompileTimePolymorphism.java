  // COMPILE TIME POLYMORPHISM -> method overloading.

  class calculator{
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

  public class CompileTimePolymorphism{
    public static void main(String[] args){
      calculator c = new calculator();
      System.out.println(c.add(45,67));
      System.out.println(c.add(78.5667, 89.9987));
    }
  }