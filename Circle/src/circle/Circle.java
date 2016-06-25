/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 * A class called circle is designed as shown in the following class diagram. It
 * contains: Two private instance variables: radius (of the type double) and
 * color (of the type String), with default value of 1.0 and "red",
 * respectively. Two overloaded constructors - a default constructor with no
 * argument, and a constructor which takes a double argument for radius. Two
 * public methods: getRadius() and getArea(), which return the radius and area
 * of this instance, respectively.
 *
 * @author Admin
 */
public class Circle {

    //private instance radius
    private double radius;
    private String color;

    //The default constructor with no argument
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // 2nd constructor with given radius, but color default

    public Circle(double r) {
        radius = r;
        color = "red";
    }

    // 3rd constructor 
    public Circle(double r, String color) {
        this.radius = r;
        this.color = color;
    }

    //A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    @Override
    public String toString() {
        return ("The circle has radius of " + this.getRadius() + " The area: " + this.getArea());
    }
}
