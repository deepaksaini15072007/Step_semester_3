package Week9Problem.assignment_problems;
interface SaverMode {
    double getSaverUnits(double units);
}
abstract class Appliance {
    double hours;

    Appliance(double hours) {
        this.hours = hours;
    }

    abstract double getPower();

    double calculateUnits() {
        return getPower() * hours / 1000;
    }

    double calculateCost(double units) {
        return units * 8;
    }
}

class Fridge extends Appliance {
    Fridge(double hours) {
        super(hours);
    }

    @Override
    double getPower() {
        return 150;
    }
}

class AC extends Appliance implements SaverMode {
    AC(double hours) {
        super(hours);
    }

    @Override
    double getPower() {
        return 1500;
    }

    @Override
    public double getSaverUnits(double units) {
        return units * 0.75;
    }
}

class TV extends Appliance {
    TV(double hours) {
        super(hours);
    }

    @Override
    double getPower() {
        return 100;
    }
}

class Washer extends Appliance implements SaverMode {
    Washer(double hours) {
        super(hours);
    }

    @Override
    double getPower() {
        return 500;
    }

    @Override
    public double getSaverUnits(double units) {
        return units * 0.75;
    }
    public static void main(String[] args) {

        Appliance[] appliances = {
            new Fridge(24),
            new AC(8),
            new TV(5),
            new Washer(2)
        };

        String[] names = {"FRIDGE", "AC", "TV", "WASHER"};
        boolean[] saver = {false, true, false, true};

        double totalCost = 0;

        for (int i = 0; i < appliances.length; i++) {

            Appliance a = appliances[i];
            double units = a.calculateUnits();

            if (saver[i]) {
                units = ((SaverMode) a).getSaverUnits(units);
            }

            double cost = a.calculateCost(units);

            System.out.printf(
                "%s: Units=%.2f Cost=%.2f%n",
                names[i], units, cost
            );

            totalCost += cost;
        }

        System.out.printf("Total Cost: %.2f%n", totalCost);
    }
}
