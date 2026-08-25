package control_flow.assignment_problems;

import java.util.*;
public class VotingEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Age: ");
        int age = sc.nextInt();
        boolean eligible = age>=18;
        if(eligible){
            System.err.println("Eligible to vote");
        }else{
            System.err.println("Not eligible to vote");
        }
        sc.close();
    }
    
}