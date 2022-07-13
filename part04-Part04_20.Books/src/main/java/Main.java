
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            int pub = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, pub));
        }

        System.out.println("What information will be printed?");
        String information = scanner.nextLine();

        if (information.equals("everything")) {
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }

        if (information.equals("name")) {
            for (Book book : books) {
                System.out.println(book.name());
            }
        }

        // implement here the program that allows the user to enter 
        // book information and to examine them
    }
}
