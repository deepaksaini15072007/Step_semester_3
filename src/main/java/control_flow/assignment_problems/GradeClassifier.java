package control_flow.assignment_problems;

import java.util.Scanner;

public class GradeClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.err.println("Enter Marks: ");
        int marks = sc.nextInt();
         if (marks >= 90 && marks <= 100) {
            System.out.println("Grade A");
        } else if (marks >= 75 && marks <= 89) {
            System.out.println("Grade B");
        } else if (marks >= 60 && marks <= 74) {
            System.out.println("Grade C");
        } else if (marks >= 40 && marks <= 59) {
            System.out.println("Grade D");
        } else if (marks >= 0 && marks <= 39) {
            System.out.println("Grade F");
        } else {
            System.out.println("Invalid Marks");
        }
        sc.close();
        
    }
}
