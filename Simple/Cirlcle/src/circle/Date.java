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
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        
        return this.invalidDate() ? this.day : 0;
    }

    public int getMonth() {
        return this.invalidMonth() ? this.month : 0;
    }

    public int getYear() {
        return this.invalidYear() ? this.year : 0;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    private void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    private boolean invalidDate() {
        return (this.day > 0) && (this.day <= 31);
    }
    
    private boolean invalidMonth() {
        return (this.month > 0) && (this.month <= 12);
    }
    
    private boolean invalidYear() {
        return (this.year >= 1900) && (this.year <= 9999);
    }

    @Override
    public String toString() {
        return this.getDay() + "/" + this.getMonth() + "/" + this.getYear(); //To change body of generated methods, choose Tools | Templates.
    }
}
