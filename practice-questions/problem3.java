import java.util.Scanner;  // always watch out for capital letters in java.

public class problem3{
  public static void main(String[] args){

   Scanner scanner = new Scanner(System.in); //this is how a scanner object is created.

   System.out.println("Enter the radius of the circle : "); //what we have to enter.
   double radius = scanner.nextInt();
   double pie = 3.141592;
   double area =  pie * (radius*radius);
   double circumference = 2 * pie * radius;

   System.out.println("The area of the circle is : " + area);
   System.out.println("the circumference of the circle is : " + circumference);



  }
}