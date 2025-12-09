class Position {
    String title;
    double salary;

    Position(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    void display() {
        System.out.println("Title: " + title + ", Salary: " + salary);
    }
}

class Employee {
    String name;
    Position position;

    Employee(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    void display() {
        System.out.println("Employee: " + name);
        position.display();
    }
}

class Company {
    String name;
    Employee[] employees;

    Company(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }

    void display() {
        System.out.println("Company: " + name);
        for (Employee e : employees) {
            e.display();
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        Position p1 = new Position("Manager", 60000);
        Position p2 = new Position("Developer", 40000);

        Employee e1 = new Employee("John", p1);
        Employee e2 = new Employee("Emma", p2);

        Employee[] employeeArray = {e1, e2};

        Company company = new Company("Tech Solutions Ltd.", employeeArray);

        company.display();
    }
}
