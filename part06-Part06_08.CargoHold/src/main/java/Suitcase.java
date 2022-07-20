
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sven
 */
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;
    private int currentWeight;

    public Suitcase(int weight) {
        this.maxWeight = weight;
        this.currentWeight = 0;
    }

    public void addItem(Item item) {
        if ((this.currentWeight + item.getWeight()) <= this.maxWeight) {
            this.currentWeight += item.getWeight();
            this.items.add(item);
        }

    }

    public String toString() {
        return this.items.size() + "items " + "(" + this.currentWeight + " kg)";
    }

}
