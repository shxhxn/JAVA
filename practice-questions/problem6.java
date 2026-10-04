//not doing 6 cuz easy, finding even/odd

import java.util.Scanner;
public class problem6{
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);

   System.out.println("Enter the first number : ");
   int first = scanner.nextInt();
   System.out.println("Enter the second number : ");
   int second = scanner.nextInt();
   System.out.println("Enter the third number : ");
   int third = scanner.nextInt();
   int largest = first;



if (second > largest) {
    largest = second;
}

if (third > largest) {
    largest = third;
}

System.out.println("Largest = " + largest);

    System.out.println("Largest number = " + largest);




  }
}