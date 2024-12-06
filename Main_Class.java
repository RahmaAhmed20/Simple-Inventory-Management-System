
package com.mycompany.main_class;

public class Main_Class {

    public static void main(String[] args) {
        
Inventory i= new Inventory();
        
Item it =new Item("h",120,4);

i.addItem(it);
Item it2 =new Item("b",220,44);
i.addItem(it2);
Item it3 =new Item("g",4200,400);
i.addItem(it3);

i.printInventory();

i.removeItem("b");

i.printInventory();


    }
}
