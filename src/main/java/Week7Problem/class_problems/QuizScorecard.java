package Week7Problem.class_problems;

public class QuizScorecard {

    private boolean[] results;
    private final int totalQuestions;
    private int answersRecorded;

    public QuizScorecard(int totalQuestions) {
        this.totalQuestions = totalQuestions;
        this.results = new boolean[totalQuestions];
        this.answersRecorded = 0;
    }

    public void recordAnswer(boolean correct) {
        if (answersRecorded >= totalQuestions) {
            System.out.println("Cannot record more answers");
            return;
        }

        results[answersRecorded] = correct;
        answersRecorded++;
    }

    public int getScore() {
        int score = 0;

        for (int i = 0; i < answersRecorded; i++) {
            if (results[i]) {
                score++;
            }
        }

        return score;
    }

    public static void main(String[] args) {

        QuizScorecard sc = new QuizScorecard(4);

        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println("Score: " + sc.getScore());
    }
}