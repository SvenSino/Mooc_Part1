
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = "alex";
        String name2 = "emma";
        String pw1 = "sunshine";
        String pw2 = "haskell";
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if ((username.equals(name1) && password.equals(pw1)) || (username.equals(name2) && password.equals(pw2))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
