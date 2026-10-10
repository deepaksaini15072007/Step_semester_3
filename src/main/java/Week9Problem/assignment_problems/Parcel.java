package Week9Problem.assignment_problems;
abstract class Parcel {
    double weight, declaredValue;

    Parcel(double weight, double declaredValue) {
        this.weight = weight;
        this.declaredValue = declaredValue;
    }

    abstract double calculateCharge();

    double calculateInsurance() {
        return 0;
    }

    double calculateTotal() {
        return calculateCharge() + calculateInsurance();
    }
}

class Standard extends Parcel {
    Standard(double weight, double value) {
        super(weight, value);
    }

    @Override
    double calculateCharge() {
        return 40 + weight * 10;
    }
}

class Express extends Parcel {
    Express(double weight, double value) {
        super(weight, value);
    }

    @Override
    double calculateCharge() {
        return 80 + weight * 15;
    }

    @Override
    double calculateInsurance() {
        return declaredValue * 0.02;
    }
}

class Fragile extends Parcel {
    Fragile(double weight, double value) {
        super(weight, value);
    }

    @Override
    double calculateCharge() {
        return 40 + weight * 10 + 50;
    }

    @Override
    double calculateInsurance() {
        return declaredValue * 0.02;
    }

    public static void main(String[] args) {

        Parcel[] parcels = {
            new Standard(3, 500),
            new Express(2, 1000),
            new Fragile(4, 2000)
        };

        String[] types = {"STANDARD", "EXPRESS", "FRAGILE"};
        double grandTotal = 0;

        for (int i = 0; i < parcels.length; i++) {
            double charge = parcels[i].calculateCharge();
            double insurance = parcels[i].calculateInsurance();
            double total = parcels[i].calculateTotal();

            System.out.printf(
                "%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",
                types[i], charge, insurance, total
            );

            grandTotal += total;
        }

        System.out.printf("Grand Total: %.2f%n", grandTotal);
    }
}
