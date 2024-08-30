import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {
    private static Map<String, String> users = new HashMap<>();

    static {
        // Sample users
        users.put("user1", "password1");
        users.put("user2", "password2");
    }

    public static boolean authenticate(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (authenticate(username, password)) {
            System.out.println("Login successful!");
            // Proceed to other functionalities
            Exam.runExam();
        } else {
            System.out.println("Login failed!");
        }
    }
}