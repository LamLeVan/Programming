/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author Admin
 */
public class TestCircle {
    
    public static void main(String[] args) {
        
        //Khai bao Circle
        Circle c1 = new Circle();
        System.out.println(c1.toString());
               
        //Khai bao c2
        Circle c2 = new Circle(2.0);
        System.out.println(c2.toString());
    }
    
}
