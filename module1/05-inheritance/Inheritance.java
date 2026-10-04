// inheritance is a method in which one class acquires the fields and methods of another class.

class animal {
  void eat(){
    System.out.println("This animal eats food."); // main class
  }
}

class dog extends animal{
  void bark(){
    System.out.println("This dog barks.");  // sub class     this example is single inheritance btw
  }
}

public class Inheritance{
  public static void main(String[] args){
    dog d1 = new dog();                   // here, we make a new dog, d1, using constructor, this object belongs to dog class.
    d1.eat();                   // as dog is a subclass of animal main class/parent class, so d1 acquired properties of animal.
    d1.bark();

  }
}

// types of inheritance.
// single inheritance : one class, inherits from another class.
// multilevel inheritance : we will take an example to understand this, animal is the main parent class, this class extends its features to
// another class, i.e dog, so here dog is the subclass to animal class. next up, there is another class, called puppy, this puppy class is extended from
// dog class. we have : animal -> dog -> puppy.
// hierarchical class : one parent class has multiple child class, suppose, animal -> dog, animal -> cat, animal -> turtle.

// multiple inheritance : a child class inherits more than one class. suppose there are two classes :
//    class flyable() -> flies
//    class swimmable() -> swims
//    class duck extends flyable, swimable{
//                  public void fly
//                  public void swim
//               }
// hybrid inheritance : a combination of two or more type of inheritance.
