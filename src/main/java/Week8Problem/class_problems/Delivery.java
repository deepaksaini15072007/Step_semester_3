package Week8Problem.class_problems;
abstract class Delivery {
    double weight, distance;

    Delivery(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    abstract double calculateFee();
}

class Standard extends Delivery {
    Standard(double weight, double distance) {
        super(weight, distance);
    }

    @Override
    double calculateFee() {
        return 5 + (0.50 * weight) + (0.10 * distance);
    }
}

class Express extends Delivery {
    Express(double weight, double distance) {
        super(weight, distance);
    }

    @Override
    double calculateFee() {
        return 15 + (1.00 * weight) + (0.20 * distance);
    }
}

class International extends Delivery {
    double customsFee;

    International(double weight, double distance, double customsFee) {
        super(weight, distance);
        this.customsFee = customsFee;
    }

    @Override
    double calculateFee() {
        return 25 + (2.00 * weight) + (0.50 * distance) + customsFee;
    }

    public static void main(String[] args) {

        Delivery[] deliveries = {
            new Standard(10, 50),
            new Express(5, 20),
            new International(20, 100, 30)
        };

        String[] types = {
            "STANDARD", "EXPRESS", "INTERNATIONAL"
        };

        double total = 0;

        for (int i = 0; i < deliveries.length; i++) {
            double fee = deliveries[i].calculateFee();

            System.out.printf("%s: %.2f%n", types[i], fee);

            total += fee;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}