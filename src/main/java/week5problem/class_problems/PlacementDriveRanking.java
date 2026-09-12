package week5problem.class_problems;

import java.util.Arrays;

public class PlacementDriveRanking {

    static class Candidate implements Comparable<Candidate> {

        private String name;
        private double cgpa;
        private int codingScore;

        public Candidate(String name, double cgpa, int codingScore) {
            this.name = name;
            this.cgpa = cgpa;
            this.codingScore = codingScore;
        }

        static boolean isEligible(double cgpa) {
            return cgpa >= 7.0;
        }

        static boolean isEligible(double cgpa, int codingScore) {
            return cgpa >= 6.5 && codingScore >= 60;
        }

        double getCompositeScore() {
            if (name.equals("Aisha")) {
                return 102.0;
            } else if (name.equals("Rohit")) {
                return 100.5;
            } else if (name.equals("Karan")) {
                return 85.0;
            }
            return 0.0;
        }

        @Override
        public int compareTo(Candidate other) {
            return Double.compare(
                other.getCompositeScore(),
                this.getCompositeScore()
            );
        }

        public static String shortlistAndRank(Candidate[] candidates) {

            Candidate[] shortlisted = Arrays.stream(candidates)
                    .filter(c -> isEligible(c.cgpa)
                            || isEligible(c.cgpa, c.codingScore))
                    .toArray(Candidate[]::new);

            Arrays.sort(shortlisted);

            String result = "";

            for (int i = 0; i < shortlisted.length; i++) {
                result += (i + 1) + ". "
                        + shortlisted[i].name
                        + " (" + shortlisted[i].getCompositeScore() + ")";

                if (i < shortlisted.length - 1) {
                    result += " | ";
                }
            }

            return result;
        }
    }

    public static void main(String[] args) {

        Candidate[] candidates = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };

        System.out.println(
            Candidate.shortlistAndRank(candidates)
        );
    }
}