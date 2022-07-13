
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
                while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            String[] spaces = input.split(" ");
            System.out.println(spaces[spaces.length -1]);
        }

    }
}
