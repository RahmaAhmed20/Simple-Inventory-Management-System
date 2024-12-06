 
package com.mycompany.main_class;
 
public class PerishableItem extends Item {
    
    private String expiryDate;

    public PerishableItem(String name, double price, int quantity, String expiryDate) {
        super(name, price, quantity);
        this.expiryDate = expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
    
}
