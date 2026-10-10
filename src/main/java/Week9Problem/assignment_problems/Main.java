package Week9Problem.assignment_problems;
abstract class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    abstract double calculateFee();

    double getTransportFee() {
        return 12000;
    }
}

class DayScholar extends Student {
    DayScholar(String name) {
        super(name);
    }

    @Override
    double calculateFee() {
        return 40000 + getTransportFee();
    }
}

class Hosteller extends Student {
    Hosteller(String name) {
        super(name);
    }

    @Override
    double calculateFee() {
        return 40000 + 60000;
    }

    @Override
    double getTransportFee() {
        return 0;
    }
}

class Scholar extends Student {
    Scholar(String name) {
        super(name);
    }

    @Override
    double calculateFee() {
        return 20000 + getTransportFee();
    }
}

public class Main {
    public static void main(String[] args) {

        Student[] students = {
            new DayScholar("Asha"),
            new Hosteller("Ravi"),
            new Scholar("Neha")
        };

        double total = 0;

        for (Student s : students) {
            double fee = s.calculateFee();

            System.out.printf("%s: %.2f%n", s.name, fee);
            total += fee;
        }

        System.out.printf("Total Collected: %.2f%n", total);
    }
}
