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
public class Account {
    
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 10;
    }
    
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    
    public String getID() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getBalance() {
        return this.balance;
    }
    
    public int credit(int amount) {
        this.balance = amount;
        return this.balance;
    }
    
    public int debit(int amount) {
        int debit = 0;
        if (amount <= this.balance) {
            debit = this.balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return debit;
    } 
    
    public int transferTo(Account another, int amount) {
        if (amount <= this.balance) {
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return another.getBalance();
    }
}
