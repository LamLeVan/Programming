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
enum Gender {
    Male, Female
}

public class Author {
    
    private String name;
    private String email;
    private Gender gender;
    
    public Author(String name, String email, Gender gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) { 
        this.email = email;
    }
    
    public Gender getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return "Author[name=" + this.getName()
                + ", email=" + this.getEmail()
                + ", gender=" + this.gender
                + "]"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
