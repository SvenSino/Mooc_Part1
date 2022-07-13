
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] spaces = input.split(" ");
            System.out.println(spaces[0]);
        }

    }
}
