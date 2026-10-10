package Week8Problem.assignment_problems;
import java.time.LocalDate;

abstract class StreamingPlan {
    String name;
    LocalDate startDate;

    StreamingPlan(String name, String startDate) {
        this.name = name;
        this.startDate = LocalDate.parse(startDate);
    }

    abstract int getValidityDays();

    LocalDate getRenewalDate() {
        return startDate.plusDays(getValidityDays());
    }
}

class Basic extends StreamingPlan {
    Basic(String name, String startDate) {
        super(name, startDate);
    }

    @Override
    int getValidityDays() {
        return 30;
    }
}

class Standard extends StreamingPlan {
    Standard(String name, String startDate) {
        super(name, startDate);
    }

    @Override
    int getValidityDays() {
        return 90;
    }
}

class Premium extends StreamingPlan {
    Premium(String name, String startDate) {
        super(name, startDate);
    }

    @Override
    int getValidityDays() {
        return 365;
    }

    public static void main(String[] args) {

        StreamingPlan[] plans = {
            new Basic("Asha", "2024-01-15"),
            new Standard("Ravi", "2024-02-01"),
            new Premium("Neha", "2024-03-10"),
            new Basic("Kiran", "2024-12-20")
        };

        for (StreamingPlan p : plans) {
            System.out.println(
                p.name + ": " + p.getRenewalDate()
            );
        }
    }
}
