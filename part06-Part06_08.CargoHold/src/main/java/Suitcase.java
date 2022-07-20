
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
        this.items = new ArrayList<>();
        this.maxWeight = weight;
        this.currentWeight = 0;
    }

    public void addItem(Item item) {
        if ((this.currentWeight + item.getWeight()) <= this.maxWeight) {
            this.currentWeight += item.getWeight();
            this.items.add(item);
        }
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item.toString());
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item holder = this.items.get(0);

        for (Item item : this.items) {
            if (item.getWeight() > holder.getWeight()) {
                holder = item;
            }
        }
        return holder;
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.items.size() == 1) {
            return this.items.size() + " item " + "(" + this.currentWeight + " kg)";
        }
        return this.items.size() + " items " + "(" + this.currentWeight + " kg)";
    }

}
