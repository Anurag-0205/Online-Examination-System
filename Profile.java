import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Profile {
    private static Map<String, String> users = new HashMap<>();

    static {
        // Sample users
        users.put("user1", "password1");
    }

    public static boolean updatePassword(String username, String oldPassword, String newPassword) {
        if (users.containsKey(username) && users.get(username).equals(oldPassword)) {
            users.put(username, newPassword);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter current password: ");
        String oldPassword = scanner.nextLine();
        System.out.print("Enter new password: ");
        String newPassword = scanner.nextLine();

        if (updatePassword(username, oldPassword, newPassword)) {
            System.out.println("Password updated successfully!");
        } else {
            System.out.println("Password update failed!");
        }
    }
}
