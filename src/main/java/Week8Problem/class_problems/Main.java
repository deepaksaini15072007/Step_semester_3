package Week8Problem.class_problems;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();
            double adjusted = amount;

            if (type.equals("CARD")) {
                adjusted = amount + amount * 0.02;
            } else if (type.equals("WALLET")) {
                adjusted = amount + amount * 0.01;
            }

            System.out.printf("%s: %.2f%n", type, adjusted);
            total += adjusted;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
