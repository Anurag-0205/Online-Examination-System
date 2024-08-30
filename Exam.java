import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam {
    private static Map<String, String> questions = new HashMap<>();
    private static Map<String, String> answers = new HashMap<>();

    static {
        // Sample questions
        questions.put("Q1: What is 2+2?", "A");
        questions.put("Q2: What is the capital of France?", "B");
    }

    public static void runExam() {
        Scanner scanner = new Scanner(System.in);

        for (String question : questions.keySet()) {
            System.out.print(question + " (A/B/C/D): ");
            String answer = scanner.nextLine();
            answers.put(question, answer);
        }

        System.out.println("Exam completed. Your answers: " + answers);
    }
}
