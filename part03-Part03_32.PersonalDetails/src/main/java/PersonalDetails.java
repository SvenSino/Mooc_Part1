
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = null;
        int longestNameLength = 0;
        int sumAge = 0;
        int count = 0;
        while (true) {

            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            count++;
            String[] spaces = input.split(",");
            sumAge += Integer.valueOf(spaces[1]);
            String name = spaces[0];
            int length = name.length();

            if (length > longestNameLength) {
                longestName = spaces[0];
                longestNameLength = length;
            }

        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of birth years: " + (double) sumAge / count);

    }
}
