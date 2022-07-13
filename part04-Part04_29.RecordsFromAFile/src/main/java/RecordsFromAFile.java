
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> person = new ArrayList<>();

        System.out.print("Name of the File: ");
        String file = scanner.nextLine();

        try ( Scanner filereader = new Scanner(Paths.get(file))) {
            while (filereader.hasNextLine()) {
                String per = filereader.nextLine();
                String[] persons = per.split(",");
                String name = persons[0];
                String age = persons[1];
                if (Integer.valueOf(age) > 1 ||Integer.valueOf(age) == 0 ) {
                    System.out.println(name + ", age: " + age + " years");
                } else {
                    System.out.println(name + ", age: " + age + " year");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
}
