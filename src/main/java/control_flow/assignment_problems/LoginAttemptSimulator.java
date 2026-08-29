package control_flow.assignment_problems;

import java.util.Scanner;

public class LoginAttemptSimulator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter correct access code: ");
        String correctCode = sc.nextLine();

        String[] attempts = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter attempt " + (i + 1) + ": ");
            attempts[i] = sc.nextLine();
        }

        boolean granted = false;

        for (int i = 0; i < attempts.length; i++) {

            if (attempts[i].equals(correctCode)) {
                System.out.println("Access granted on attempt " + (i + 1));
                granted = true;
                break;
            }
        }

        if (!granted) {
            System.out.println("Access denied — all attempts used");
        }

        sc.close();
    }
}