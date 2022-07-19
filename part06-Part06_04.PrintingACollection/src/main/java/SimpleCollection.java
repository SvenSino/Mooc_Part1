
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String alphabet = "";

        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        for (String letter : elements) {
            if (this.elements.size() == 1) {
                alphabet = alphabet + letter;
            } else {
                alphabet = alphabet + letter + "\n";
            }
        }
        if (this.elements.size() == 1) {
            return "The collection " + this.name + " has " + this.elements.size() + " element:" + "\n" + alphabet;
        }
        return "The collection " + this.name + " has " + this.elements.size() + " elements:" + "\n" + alphabet;
    }

}
