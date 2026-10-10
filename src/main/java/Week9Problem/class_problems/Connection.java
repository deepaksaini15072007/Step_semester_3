package Week9Problem.class_problems;
abstract class Connection {
    int units;

    Connection(int units) {
        this.units = units;
    }

    abstract double calculateBill();
}

class Home extends Connection {
    Home(int units) {
        super(units);
    }

    @Override
    double calculateBill() {
        if (units <= 100) {
            return units * 5;
        } else {
            return 100 * 5 + (units - 100) * 7;
        }
    }
}

class Shop extends Connection {
    Shop(int units) {
        super(units);
    }

    @Override
    double calculateBill() {
        return units * 8 + 100;
    }
}

class Factory extends Connection {
    Factory(int units) {
        super(units);
    }

    @Override
    double calculateBill() {
        return Math.max(units * 6, 1000);
    }

    public static void main(String[] args) {

        Connection[] connections = {
            new Home(150),
            new Shop(90),
            new Factory(120)
        };

        String[] types = {"HOME", "SHOP", "FACTORY"};
        double total = 0;

        for (int i = 0; i < connections.length; i++) {
            double bill = connections[i].calculateBill();

            System.out.printf("%s: %.2f%n", types[i], bill);
            total += bill;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}
