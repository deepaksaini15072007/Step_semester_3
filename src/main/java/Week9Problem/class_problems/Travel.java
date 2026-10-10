package Week9Problem.class_problems;
abstract class Travel {
    double distance;
    static final double BOOKING_FEE = 50;

    Travel(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();

    double calculateTotal() {
        return calculateFare() + BOOKING_FEE;
    }
}

class Bus extends Travel {
    Bus(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 2;
    }
}

class Train extends Travel {
    Train(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 1.5;
    }
}

class Flight extends Travel {
    Flight(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return 2500 + distance * 4;
    }

    public static void main(String[] args) {

        Travel[] bookings = {
            new Bus(200),
            new Train(300),
            new Flight(500)
        };

        String[] modes = {"BUS", "TRAIN", "FLIGHT"};

        for (int i = 0; i < bookings.length; i++) {
            System.out.printf("%s: %.2f%n",
                modes[i], bookings[i].calculateTotal());
        }
    }
}
