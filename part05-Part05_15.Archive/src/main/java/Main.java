
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        ArrayList<Item> printed = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
              System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            items.add(new Item(identifier, name));
        }
        
        System.out.println("==Items==");
        
        for (Item item : items) {
            if(!printed.contains(item)) {
                System.out.println(item.toString());
                printed.add(item);
            }
        }
       
 


    }
}
