/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypoint;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MyPoint {
    
    private int x;
    private int y;
    
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
       
    void setX(int x) {
        this.x = x;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public int[] getXY() {
        int[] a = {this.getX(), this.getY()};
        return a;
    }
    
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(int x, int y) {
        return abs(x - y);
    }
    
    public double distance(MyPoint another) {
        double newX = this.x - another.x;
        double newY = this.y - another.y;
        return Math.sqrt(newX*newX + newY * newY);
    }
    
    double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    void setY(int y) {
        this.y = y;
    }
}
    
