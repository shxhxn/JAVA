// abstraction

import java.util.Scanner;

class Figure {

    String square;

    String rectangle;

    String circle;

    void takeValue() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the shape : ");

        String shape = sc.nextLine(); // sc.nextLine is ONLY USED FOR STRINGS, NOT FOR INT OR DOUBLE. for int, use nextInt

        taking_values obj = new taking_values(shape);
    }

}

class taking_values {

    Scanner sc = new Scanner(System.in);

    taking_values(String shape) {

        if (shape.equals("square")) { // we dont write shape == square in java.

            System.out.println("Enter the length of side : ");

            int length = sc.nextInt();

            calculating_area obj = new calculating_area(length);
        }

        else if(shape.equals("rectangle")) {

            System.out.println("Enter the length of rectangle : ");

            int length = sc.nextInt();

            System.out.println("Enter the breadth of rectangle : ");

            int breadth = sc.nextInt();

            calculating_area obj = new calculating_area(length, breadth);
        }

    }

}

class calculating_area {

    calculating_area(int length, int breadth) {

        int area = length * breadth;

        System.out.println("Area of rectangle = " + area);

    }

    calculating_area(int length) {

        int area = length * length; // this is a good example of constructor overloading, because

        System.out.println("Area of square = " + area); // if we choose square, so there will be only one data, it'll pass to calculating_area(int length)

    }

}

public class ShapeAreas {

    public static void main(String[] args) {

        Figure obj = new Figure();

        obj.takeValue();

    }

}

// all the complicated working of the code is not shown to the users, instead,
