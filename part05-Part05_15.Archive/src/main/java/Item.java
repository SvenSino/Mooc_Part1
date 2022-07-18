/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sven
 */
public class Item {

    private String ident;
    private String name;

    public Item(String ident, String name) {
        this.ident = ident;
        this.name = name;
    }

    public String getIdent() {
        return ident;
    }
    
    

    public boolean equals(Object comp) {
        if (this == comp) {
            return true;
        }

        if (!(comp instanceof Item)) {
            return false;
        }

        Item compItem = (Item) comp;
        
        return this.ident.equals(compItem.getIdent());
    }
    
    public String toString() {
        return this.ident + ": " + this.name;
    }

}
