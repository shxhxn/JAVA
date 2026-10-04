class Car {

    void start() {
        System.out.println("Car started");
    }
}

public class messagePassing {

    public static void main(String[] args) {

        Car car = new Car();

        car.start();  // message passing-> car.start();
    }
}