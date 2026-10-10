package Week8Problem.assignment_problems;
abstract class Customer {
    double amount;

    Customer(double amount) {
        this.amount = amount;
    }

    abstract double calculateAmount();
}

class Student extends Customer {
    Student(double amount) {
        super(amount);
    }

    @Override
    double calculateAmount() {
        return amount - amount * 0.10;
    }
}

class Staff extends Customer {
    Staff(double amount) {
        super(amount);
    }

    @Override
    double calculateAmount() {
        return amount - amount * 0.05;
    }
}

class Guest extends Customer {
    Guest(double amount) {
        super(amount);
    }

    @Override
    double calculateAmount() {
        return amount + 10;
    }
}

public class Main {
    public static void main(String[] args) {

        Customer[] customers = {
            new Student(200),
            new Staff(300),
            new Guest(150)
        };

        String[] types = {"STUDENT", "STAFF", "GUEST"};
        double total = 0;

        for (int i = 0; i < customers.length; i++) {
            double bill = customers[i].calculateAmount();

            System.out.printf("%s: %.2f%n", types[i], bill);
            total += bill;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}
