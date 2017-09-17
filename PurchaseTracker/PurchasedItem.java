
/**
 * A custom class to represent a purchased item based on name,
 * unit price, and a quantity purchased.
 * 
 * @author Jim Teresco
 * Siena College, CSIS 210, Fall 2016, Fall 2017
 * 
 */

import java.text.DecimalFormat;

public class PurchasedItem {

    // we need instance variables to remember the
    // name, unit price, and quantity
    private String name;
    private double unitPrice;
    private int quantity;
    
    // we can create a static class variable that refers to
    // a single DecimalFormat object that can be shared among
    // all instances of this class
    private static DecimalFormat currency = new DecimalFormat("$0.00");
    
    // our constructor needs the initial values for the three
    // fields in our object
    public PurchasedItem(String name, double unitPrice, int quantity) {
    
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    
    // we'll need a toString method
    public String toString() {
        
        return name + ": " + quantity + " @ " + currency.format(unitPrice) +
            " = " + currency.format(unitPrice * quantity);
    }
    
    // a variety of accessors are needed here, and here they are
    public double getUnitPrice() {
        
        return unitPrice;
    }
    
    public int getQuantity() {
        
        return quantity;
    }
    
    public double getTotalCost() {
        
        return unitPrice * quantity;
    }
}
