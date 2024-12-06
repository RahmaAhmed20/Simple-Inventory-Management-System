 
package com.mycompany.main_class;

public class ElectronicItem extends Item {
   
    private String warrantyPeriod;

    public ElectronicItem(String name, double price, int quantity, String warrantyPeriod) {
        super(name, price, quantity);
        this.warrantyPeriod= warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }
    
    
}
