package Week9Problem.assignment_problems;
interface NightService {
    double getNightFare(double fare);
}

abstract class Cab {
    double km;

    Cab(double km) {
        this.km = km;
    }

    abstract double calculateFare();

    double getMinimumFare(double fare) {
        return Math.max(fare, 100);
    }
}

class Mini extends Cab {
    Mini(double km) {
        super(km);
    }

    @Override
    double calculateFare() {
        return getMinimumFare(km * 10);
    }
}

class Sedan extends Cab implements NightService {
    Sedan(double km) {
        super(km);
    }

    @Override
    double calculateFare() {
        return getMinimumFare(km * 14);
    }

    @Override
    public double getNightFare(double fare) {
        return fare * 1.20;
    }
}

class SUV extends Cab implements NightService {
    SUV(double km) {
        super(km);
    }

    @Override
    double calculateFare() {
        return getMinimumFare(km * 18);
    }

    @Override
    public double getNightFare(double fare) {
        return fare * 1.20;
    }
    public static void main(String[] args) {

        Cab[] cabs = {
            new Mini(8),
            new Sedan(10),
            new SUV(20),
            new Mini(5)
        };

        String[] types = {"MINI", "SEDAN", "SUV", "MINI"};
        String[] times = {"DAY", "NIGHT", "DAY", "NIGHT"};

        double total = 0;

        for (int i = 0; i < cabs.length; i++) {

            if (times[i].equals("NIGHT") && !(cabs[i] instanceof NightService)) {
                System.out.println(types[i] + ": night service not available");
                continue;
            }

            double fare = cabs[i].calculateFare();

            if (times[i].equals("NIGHT")) {
                fare = ((NightService) cabs[i]).getNightFare(fare);
            }

            System.out.printf("%s: %.2f%n", types[i], fare);
            total += fare;
        }

        System.out.printf("Total: %.2f%n", total);
    }
}
