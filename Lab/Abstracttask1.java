abstract class Shape {

    abstract double calculateArea();

    
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Abstracttask1 {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 5);
        rect.displayShape();
        System.out.println("Rectangle Area: " + rect.calculateArea());

        Shape circle = new Circle(7);
        circle.displayShape();
        System.out.println("Circle Area: " + circle.calculateArea());
    }
}