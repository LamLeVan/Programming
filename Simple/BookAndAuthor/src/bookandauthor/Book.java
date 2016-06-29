/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookandauthor;

/**
 *
 * @author Admin
 */
public class Book {

    @SuppressWarnings("FieldMayBeFinal")
    private String name;
    @SuppressWarnings("FieldMayBeFinal")
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    @SuppressWarnings("SillyAssignment")
    public Book(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }
    
    public String getName() {
        return this.name;
    }

    public Author[] getAuthors() {
        return authors;
    }
   
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getQty() {
        return this.qty;
    }
    
    public void setQty(int qty) {    
        this.qty = qty;
    }
    
    public String getAuthorNammes() {
        String names = "";
        for (Author author : this.getAuthors()) {
            names = names + author;
        }
        return names;
    }

    @Override
    public String toString() {
        return "Book[name=" + this.getName()
                + "names= " + this.getAuthorNammes()
                + ", price=" + this.getPrice()
                + ", qty=" + this.getQty();
    }
}
