
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
public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    private int currentWeight;

    public Hold(int weight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = weight;
        this.currentWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((this.currentWeight + suitcase.totalWeight()) <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
        
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    public String toString() {
        int weight = 0;
        for (Suitcase suitcase : this.suitcases) {
            weight += suitcase.totalWeight();
        }
        return this.suitcases.size() + " suitcases (" + weight + " kg)";
    }

}
