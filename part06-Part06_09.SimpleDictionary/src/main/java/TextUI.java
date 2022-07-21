
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sven
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary simpleDic;

    public TextUI(Scanner scanner, SimpleDictionary simpleDic) {
        this.scanner = scanner;
        this.simpleDic = simpleDic;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if (command.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String trans = scanner.nextLine();
                this.simpleDic.add(word, trans);
            }
            if (command.equals("search")) {
                System.out.println("To be translated:");
                String search = scanner.nextLine();
                if(this.simpleDic.translate(search) != null) {
                     System.out.println(this.simpleDic.translate(search));
                } else {
                    System.out.println("Word " + search + " was not found");
                }
               
            }
            else {
                System.out.println("Unknown command");
            }

        }
    }

}
