import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ExamWithTimer {
    private static Map<String, String> questions = new HashMap<>();
    private static Map<String, String> answers = new HashMap<>();
    private static boolean timeUp = false;

    static {
        // Sample questions
        questions.put("Q1: What is 2+2?", "A");
        questions.put("Q2: What is the capital of France?", "B");
    }

    public static void runExam() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                timeUp = true;
                System.out.println("Time is up!");
            }
        }, 60000); // 1 minute timer

        Scanner scanner = new Scanner(System.in);

        for (String question : questions.keySet()) {
            if (timeUp) break;
            System.out.print(question + " (A/B/C/D): ");
            String answer = scanner.nextLine();
            answers.put(question, answer);
        }

        if (timeUp) {
            System.out.println("Automatically submitted: " + answers);
        } else {
            System.out.println("Exam completed. Your answers: " + answers);
        }
    }
}
