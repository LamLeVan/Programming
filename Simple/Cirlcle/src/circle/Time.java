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
public class Time {
    private int hour; 
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return invalidHour() ? hour: 0;
    }

    public int getMinute() {
        return invalidMinute() ? minute: 0;
    }

    public int getSecond() {
        return invalidSecond() ? second: 0;
    }
    
    private int nextSecond() {
        return second + 1;
    }
    
    private int previousSecond() {
        return second - 1;
    }
    
    private boolean invalidHour() {
        return (hour >= 0) && (hour <= 23);
    }
    
    private boolean invalidMinute() {
        return (minute >= 0) && (minute <= 59);
    }
    
    private boolean invalidSecond() {
        return (second >= 0) && (second <= 59);
    }
    
    @Override
    public String toString() {
        return this.hour + ":" + this.minute + ":" + this.second;
    }  
}
