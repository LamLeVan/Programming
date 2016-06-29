/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypoint;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }
    
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    
    public int getRadius() {
        return this.radius;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public MyPoint getCenter() {
        return this.center;
    }
    
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    
    public int getCenterX() {
        return this.center.getX();
    }
    
    public void setCenterX(int x) {
        this.center.setX(x);
    }
    
    public int getCenterY() {
        return this.center.getY();
    }
    
    public void setCenterY(int y) {
        this.center.setY(y);
    }
    
    public int[] getCenterXY() {
        return this.center.getXY();
    }
    
    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }
    
    public double circleReference() {
        return Math.PI * 2 * this.radius;
    }
    
    public double distance(MyCircle another) {
        MyPoint center = another.getCenter();
        center.distance(center);
        return center.distance();
    }
}
