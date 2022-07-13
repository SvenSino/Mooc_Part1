
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldestName = null;
        int oldestAge = 0;
        while (true) {

            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] spaces = input.split(",");
            String name = spaces[0];
            int age = Integer.valueOf(spaces[1]);
            if (age > oldestAge) {
                oldestName = spaces[0];
                oldestAge = age;
            }

        }
        System.out.println("Name of the oldest: " + oldestName);

    }
}
