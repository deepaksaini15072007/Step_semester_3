package Week9Problem.class_problems;
abstract class Plot {
    String owner;

    Plot(String owner) {
        this.owner = owner;
    }

    abstract double calculateArea();
}

class Circle extends Plot {
    double radius;

    Circle(String owner, double radius) {
        super(owner);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Plot {
    double length, width;

    Rectangle(String owner, double length, double width) {
        super(owner);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Plot {
    double base, height;

    Triangle(String owner, double base, double height) {
        super(owner);
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {

        Plot[] plots = {
            new Circle("Asha", 5),
            new Rectangle("Ravi", 4, 6),
            new Triangle("Neha", 10, 3)
        };

        String[] shapes = {"CIRCLE", "RECTANGLE", "TRIANGLE"};
        double total = 0;

        for (int i = 0; i < plots.length; i++) {
            double area = plots[i].calculateArea();

            System.out.printf("%s (%s): %.2f%n",
                    plots[i].owner, shapes[i], area);

            total += area;
        }

        System.out.printf("Total Area: %.2f%n", total);
    }
}
