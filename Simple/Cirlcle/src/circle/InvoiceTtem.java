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
public class InvoiceTtem {
    
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceTtem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public double getTotal() {
        return this.unitPrice * this.qty;
    }

    @Override
    public String toString() {
        return "InvoiceItem["
                + "id=" + this.getId()
                + ", desc = " + this.getDesc()
                + ", qty = " + this.getQty()
                + ", unitPrice = " + this.getUnitPrice()
                + "]";//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
