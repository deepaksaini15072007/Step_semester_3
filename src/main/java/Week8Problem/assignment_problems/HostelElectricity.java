package Week8Problem.assignment_problems;
abstract class Room {
    int units;

    Room(int units) {
        this.units = units;
    }

    abstract double calculateBill();
}

class Single extends Room {
    Single(int units) {
        super(units);
    }

    @Override
    double calculateBill() {
        return units * 8;
    }
}

class Shared extends Room {
    int occupants;

    Shared(int units, int occupants) {
        super(units);
        this.occupants = occupants;
    }

    @Override
    double calculateBill() {
        return (units * 6.0) / occupants;
    }
}

class AC extends Room {
    AC(int units) {
        super(units);
    }

    @Override
    double calculateBill() {
        return units * 10 + 200;
    }
}

public class HostelElectricity {
    public static void main(String[] args) {

        Room[] rooms = {
            new Single(120),
            new Shared(150, 3),
            new AC(100)
        };

        String[] types = {"SINGLE", "SHARED", "AC"};
        double total = 0;

        for (int i = 0; i < rooms.length; i++) {
            double bill = rooms[i].calculateBill();

            System.out.printf("%s: %.2f%n", types[i], bill);
            total += bill;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}
