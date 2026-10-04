public class EmployeeBonus {

    public static void main(String[] args) {

        Employee emp = new Employee("Rahul", 50000);

        emp.display();
    }
}

class Employee {

    String companyName = "Infotech";
    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Calculate bonus
    double calculateBonus() {
        return salary * 0.10;
    }

    // Display details
    void display() {
        System.out.println("Company Name : " + companyName);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Bonus : " + calculateBonus());
    }
}
