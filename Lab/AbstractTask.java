abstract class Employee {
    protected String name;

    Employee(String name) {
        this.name = name;
    }

    abstract double calculateSalary();

    void showDetails() {
        System.out.println("Employee Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

public class AbstractTask {
    public static void main(String[] args) {
        Employee emp = new FullTimeEmployee("Alice", 50000);
        emp.showDetails();
        System.out.println("Monthly Salary: " + emp.calculateSalary());
    }
}