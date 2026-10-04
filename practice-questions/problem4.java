
import java.util.Scanner;

public class problem4{
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter the marks of subject 1: ");
      float subject1 = scanner.nextFloat();
      System.out.println("Enter the marks of subject 2: ");
      float subject2 = scanner.nextFloat();
      System.out.println("Enter the marks of subject 3: ");
      float subject3 = scanner.nextFloat();
      System.out.println("Enter the marks of subject 4: ");
      float subject4 = scanner.nextFloat();
      System.out.println("Enter the marks of subject 5: ");
      float subject5 = scanner.nextFloat();

      float total_marks = subject1 + subject2 + subject3 + subject4 + subject5;
      float average = total_marks/5;
      float percentage = average;

      System.out.println("Total marks = " + total_marks);
      System.out.println("Average = " + average);
      System.out.println("Percentage = " + percentage);


  }
}
