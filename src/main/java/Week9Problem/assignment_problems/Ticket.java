package Week9Problem.assignment_problems;
abstract class Ticket {
    int count;
    static final double FEE = 20;

    Ticket(int count) {
        this.count = count;
    }

    abstract double getPrice();

    double calculateTotal() {
        return (getPrice() + FEE) * count;
    }
}

class Regular extends Ticket {
    Regular(int count) {
        super(count);
    }

    @Override
    double getPrice() {
        return 150;
    }
}

class Premium extends Ticket {
    Premium(int count) {
        super(count);
    }

    @Override
    double getPrice() {
        return 250;
    }
}

class Recliner extends Ticket {
    Recliner(int count) {
        super(count);
    }

    @Override
    double getPrice() {
        return 400;
    }

    public static void main(String[] args) {

        Ticket[] tickets = {
            new Regular(3),
            new Premium(2),
            new Recliner(1)
        };

        String[] types = {"REGULAR", "PREMIUM", "RECLINER"};
        double total = 0;

        for (int i = 0; i < tickets.length; i++) {
            double amount = tickets[i].calculateTotal();

            System.out.printf("%s: %.2f%n", types[i], amount);
            total += amount;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}
