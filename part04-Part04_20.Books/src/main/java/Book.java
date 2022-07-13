/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sven
 */
public class Book {

    private String title;
    private int pages;
    private int pub;

    public Book(String title, int pages, int pub) {
        this.title = title;
        this.pages = pages;
        this.pub = pub;
    }
    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.pub;
    }
    
    public String name() {
        return this.title;
    }
    
}
