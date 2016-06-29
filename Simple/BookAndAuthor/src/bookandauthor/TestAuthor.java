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
        Author ahTeck = new Author("Lam", "lam@gmail.com", Gender.Male);
        ahTeck.toString();
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("email is " + ahTeck.getEmail());
        System.out.println("gender is " + ahTeck.getGender());
    }
}
