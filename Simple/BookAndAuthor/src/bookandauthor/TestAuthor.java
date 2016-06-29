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
public class TestAuthor {

    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", Gender.Male);
        System.out.println(ahTeck);  // Author's toString()

        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);  // Test Book's Constructor
        System.out.println(dummyBook);  // Test Book's toString()

// Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

// Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", Gender.Male), 29.95);
        System.out.println(anotherBook);
    }
}
