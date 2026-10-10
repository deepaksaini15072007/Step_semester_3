package Week8Problem.class_problems;
abstract class Transport {
    double distance;

    Transport(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();
}

class Bus extends Transport {
    Bus(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return Math.min(2 + 0.10 * distance, 10);
    }
}

class Train extends Transport {
    Train(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return 3 + 0.15 * distance;
    }
}

class Metro extends Transport {
    double peakHourFactor;

    Metro(double distance, double peakHourFactor) {
        super(distance);
        this.peakHourFactor = peakHourFactor;
    }

    @Override
    double calculateFare() {
        return (1.50 + 0.20 * distance) * peakHourFactor;
    }
    public static void main(String[] args) {

        Transport[] journeys = {
            new Bus(15),
            new Train(50),
            new Metro(10, 1.5)
        };

        String[] types = {"BUS", "TRAIN", "METRO"};
        double total = 0;

        for (int i = 0; i < journeys.length; i++) {
            double fare = journeys[i].calculateFare();

            System.out.printf("%s: %.2f%n", types[i], fare);
            total += fare;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}
